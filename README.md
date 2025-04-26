# rosterly
OpenAPI + JSP を使ったウェブアプリケーションの勉強用

# 目的
OpenAPIを用いたJavaのWebAPIサーバと、JSPを持ちいたフロントエンドの２つのアプリケーションのを作成し、
双方のアプリケーションの実装のサンプルとしたい。

# 開発・実行環境
1. データベースは、PostgresSQL
2. Javaアプリケーションサーバは、tomcat
3. フロントエンドは、Java/JSPを用いて、HTML部分は、Vue/Vuetify

# コーディング規約
1. Javaのコーディング規約は、「Google Java Style Guide」に準拠してください。
## Java以外の命名規約
- JSONフィールド名: キャメルケース
- データベース：アッパースネークケース
- URLエンドポイント：ケバブケース

# サンプルウェブアプリケーションについて
## 目的
複数会社の作業者名簿を管理するウェブアプリケーション

## 管理対象データ
- 所属会社：Company
  - `companyId` (integer)  
  - `name` (string)  

- 作業者：Member
    - `memberId` (integer)  
    - `name` (string)  
        - 必須、1～50文字。  
    - `email` (string)  
        - 必須、RFC 5322 準拠のメールアドレス形式。  
    - `phone` (string, optional) 
        - 任意、パターン `^0[789]0-\d{4}-\d{4}$`（例: 090-1234-5678） 
    - `role` (enum: `Developer`／`Tester`／`Manager`)  
        - 必須、`Developer`／`Tester`／`Manager` のいずれか。  
    - `companyId` (integer, FK → Company)  
    - `joinDate` (string, format: date)  
    
## 必要な機能
- フロントエンド
    - 所属会社の新規作成・変更・削除・一覧表示
    - メンバーの新規作成・変更・削除・一覧表示
- WebAPIサーバ
    - 所属会社の新規作成・削除
    - メンバーの新規作成・変更・削除・リスト返却

