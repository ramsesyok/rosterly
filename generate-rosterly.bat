@echo off
REM ==============================================
REM OpenAPI ��`���� Spring Boot �R�[�h�𐶐�����o�b�`
REM �v���W�F�N�g��: rosterly
REM ==============================================

REM 1) ��`�t�@�C��(api.yaml)�̃p�X���m�F
set "API_DEF=%~dp0openapi.yaml"

REM 2) �o�̓f�B���N�g���� rosterly �ɐݒ�
set "OUTPUT_DIR=%~dp0rosterly"

REM 3) OpenAPI Generator ���s
REM ===============================================
REM -i .\api.yaml�F���͂ƂȂ� OpenAPI ��`�t�@�C��
REM -g spring�FSpring Boot (Spring MVC) �e���v���[�g
REM -o .\generated�F�o�̓f�B���N�g��
REM --group-id / --artifact-id / --artifact-version�FMaven �� GAV
REM interfaceOnly=true�FController �C���^�t�F�[�X�{���f���̂ݐ���
REM delegatePattern=true�F�T�[�o�[�t�@�C�����f���Q�[�g�p�^�[���Ő���
REM useBeanValidation=true�FBean Validation API ���߂�L����
REM performBeanValidation=true�FBean Validation API ���g���ăo���f�[�V����
REM unhandledException=true�F�������̗�O���n���h�����O
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
  echo [ERROR] �R�[�h�����Ɏ��s���܂����B
  pause
  exit /b 1
) else (
  echo [OK] rosterly �v���W�F�N�g�𐶐����܂���: "%OUTPUT_DIR%"
)



REM ==================================================
REM unhandledException 
REM �������ꂽ Controller �𒼐ڐG�炸�ɁADelegate ���ŗ�O�𓊂���� OK�B
REM Spring �̃O���[�o����O�n���h���i@ControllerAdvice�j���P�ӏ��p�ӂ��邱�ƂŁA
REM �S�G���h�|�C���g�̗�O�}�b�s���O���ꌳ�Ǘ��ł��܂��B
REM --------------------------------------------
REM @ControllerAdvice
REM public class GlobalExceptionHandler {
REM     @ExceptionHandler(MyBusinessException.class)
REM     public ResponseEntity<ErrorResponse> handleBusiness(MyBusinessException ex) {
REM         return ResponseEntity
REM             .status(HttpStatus.BAD_REQUEST)
REM             .body(new ErrorResponse("BUSINESS_ERROR", ex.getMessage()));
REM     }
REM     // ���̗�O�n���h��...
REM }
REM --------------------------------------------
REM ==================================================