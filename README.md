# Sample for ClojureScript browser repl

## Usage

- Build clojurescript using `lein cljsbuild once`.
- Type `lein repl` in project directory.
- Type `(use 'cljs-browser-repl-sample.core)` in the repl.
- Type `(server)` in the repl.
- Type `(browser-repl)` in the repl.
- Open your browser and go to `http://localhost:8080`
- Type `(js/alert "Hello Clojure")` in the repl, you will see dialog is shown in your browser.

## License

Copyright © 2014 cataska

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
