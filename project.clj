(defproject crawly "1.0.0-SNAPSHOT"
  :description "Provides access to 80legs crawling"
  :namespaces [
    crawly.app
  ]
  :dev-dependencies [
    [lein-javac "0.0.1-SNAPSHOT"]]
  :javac-target "1.6"
  :javac-debug "true"
  :dependencies [
    [eighty-legs/eighty-legs "1.3.0"]
    [org.clojure/clojure "1.1.0"]
    [org.clojure/clojure-contrib "1.1.0"]])