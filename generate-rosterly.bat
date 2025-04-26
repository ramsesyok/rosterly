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
REM skipDefaultInterface=true：デフォルト実装をスキップ
REM ===============================================

java -jar openapi-generator-cli.jar generate ^
  -i "%API_DEF%" ^
  -g spring ^
  -o "%OUTPUT_DIR%" ^
  --group-id com.example ^
  --artifact-id rosterly ^
  --artifact-version 0.0.1-SNAPSHOT ^
  --additional-properties=interfaceOnly=true,java8=true,skipDefaultInterface=true

if errorlevel 1 (
  echo [ERROR] コード生成に失敗しました。
  pause
  exit /b 1
) else (
  echo [OK] rosterly プロジェクトを生成しました: "%OUTPUT_DIR%"
)
