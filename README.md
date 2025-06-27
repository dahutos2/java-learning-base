# Javaの基礎の学習用ブランチ

[独習 Java](https://www.shoeisha.co.jp/book/detail/9784798151120) を参考に、Javaの基礎を学んでいます。

## プロジェクト一覧

- `selflearn`: Java 基礎・応用サンプル
- `mylib`: 共有ライブラリ

## 開発環境

- **Eclipse**: 2021-09 (4.21.0)
- **JDK**: JavaSE 11

## セットアップ手順

1. 本リポジトリをクローンします。
    ```bash
    git clone https://github.com/dahutos2/java-learning-base.git
    ```

2. Eclipse を起動し、任意のワークスペースで以下を行います。
     - **親フォルダ (java-learning-base)** を General Project としてインポート
      ```
      File > Import > General > Existing Project into Workspace
      ```
      → `java-learning-base` を選択。
     - **各子プロジェクト (selflearn, sharedlib, sampleapp)** を Java Project として個別にインポート
      ```
      File > Import > Existing Projects into Workspace
      ```
      → `selflearn`, `mylib` をそれぞれ選択。

## ビルド方法
Eclipse のビルド（自動ビルド推奨）で各プロジェクトのソースコードをビルドできます。

## 注意事項
- このリポジトリは Eclipse 専用の設定ファイル（.project, .classpath, .settings）を含みます。
- 他 IDE (VSCode, IntelliJ) ではプロジェクト認識に追加設定が必要です。
- ビルド成果物や一時ファイルは Git 管理対象に含めていません。
