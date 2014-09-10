(ns cljs-browser-repl-sample.core
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.handler :refer [site]]
            [compojure.route :as route]
            [hiccup.page :refer [html5 include-js]]
            [org.httpkit.server :refer [run-server]]
            [cljs.repl :as repl]
            [cljs.repl.browser :as browser]))

(defn main-page []
  (html5
    [:head
      [:title "ClojureScript Browser Repl Sample"]
      [:body (include-js "app.js")]]))

(defroutes app
  (GET "/" [] (main-page))
  (route/resources "/")
  (route/not-found "Not Found"))

(defn browser-repl []
  (repl/repl (browser/repl-env)))

(defn server []
  (run-server (site #'app) {:port 8080}))

(defn -main []
  (println "Server start...")
  (server))
