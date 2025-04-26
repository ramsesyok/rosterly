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
REM skipDefaultInterface=true�F�f�t�H���g�������X�L�b�v
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
  echo [ERROR] �R�[�h�����Ɏ��s���܂����B
  pause
  exit /b 1
) else (
  echo [OK] rosterly �v���W�F�N�g�𐶐����܂���: "%OUTPUT_DIR%"
)
