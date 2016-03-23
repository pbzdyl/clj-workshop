# clj-workshop

This project contains a few Clojure programming exercises

## Usage

In your terminal start the autotest loop

    lein autotest

It will watch your project files and whenever they change all your tests will be rerun.

Problems are defined in `src/clj-workshop/*.clj` files. Each problem has its unit tests defined in a corresponding `test/clj-workshop/*_test.clj` file.

When working on a given problem, uncomment its `deftest` by removing `#_` from `#_deftest`.
