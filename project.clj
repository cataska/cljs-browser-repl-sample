(defproject cljs-browser-repl-sample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2322"]
                 [compojure "1.1.8"]
                 [http-kit "2.1.16"]
                 [ring "1.3.1"]
                 [hiccup "1.0.5"]]

  :main cljs-browser-repl-sample.core
  
  :plugins [[lein-cljsbuild "1.0.3"]]

  :source-paths ["src/clj"]
  
  :cljsbuild {:builds
              [{:source-paths ["src/cljs"]
                :compiler {:output-to "resources/public/app.js"
                           :optimizations :whitespace
                           :pretty-print true}}]})
