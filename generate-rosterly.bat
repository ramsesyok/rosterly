@echo off
REM ==============================================
REM OpenAPI 定義から Spring Boot コードを生成するバッチ
REM プロジェクト名: rosterly
REM ==============================================

REM 1) 定義ファイル(api.yaml)のパスを確認
set "API_DEF=%~dp0openapi.yaml"

REM 2) 出力ディレクトリを rosterly に設定
set "OUTPUT_DIR=%~dp0rosterly"

REM 3) OpenAPI Generator 実行
REM ===============================================
REM -i .\api.yaml：入力となる OpenAPI 定義ファイル
REM -g spring：Spring Boot (Spring MVC) テンプレート
REM -o .\generated：出力ディレクトリ
REM --group-id / --artifact-id / --artifact-version：Maven の GAV
REM interfaceOnly=true：Controller インタフェース＋モデルのみ生成
REM delegatePattern=true：サーバーファイルをデリゲートパターンで生成
REM useBeanValidation=true：Bean Validation API 注釈を有効化
REM performBeanValidation=true：Bean Validation API を使ってバリデーション
REM unhandledException=true：未処理の例外をハンドリング
REM ===============================================

java -jar openapi-generator-cli.jar generate ^
  -i "%API_DEF%" ^
  -g spring ^
  -o "%OUTPUT_DIR%" ^
  --group-id com.example ^
  --artifact-id rosterly ^
  --artifact-version 0.0.1-SNAPSHOT ^
  --additional-properties=^
basePackage=com.example.rosterly,^
apiPackage=com.example.rosterly.api,^
modelPackage=com.example.rosterly.model,^
configPackage=com.example.rosterly.config,^
invokerPackage=com.example.rosterly.invoker,^
documentationProvider=springdoc,^
delegatePattern=true,^
useBeanValidation=true,^
performBeanValidation=true,^
unhandledException=true,^
booleanGetterPrefix=is


if errorlevel 1 (
  echo [ERROR] コード生成に失敗しました。
  pause
  exit /b 1
) else (
  echo [OK] rosterly プロジェクトを生成しました: "%OUTPUT_DIR%"
)



REM ==================================================
REM unhandledException 
REM 生成された Controller を直接触らずに、Delegate 内で例外を投げれば OK。
REM Spring のグローバル例外ハンドラ（@ControllerAdvice）を１箇所用意することで、
REM 全エンドポイントの例外マッピングを一元管理できます。
REM --------------------------------------------
REM @ControllerAdvice
REM public class GlobalExceptionHandler {
REM     @ExceptionHandler(MyBusinessException.class)
REM     public ResponseEntity<ErrorResponse> handleBusiness(MyBusinessException ex) {
REM         return ResponseEntity
REM             .status(HttpStatus.BAD_REQUEST)
REM             .body(new ErrorResponse("BUSINESS_ERROR", ex.getMessage()));
REM     }
REM     // 他の例外ハンドラ...
REM }
REM --------------------------------------------
REM ==================================================