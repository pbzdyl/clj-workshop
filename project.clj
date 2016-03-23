(defproject clj-workshop "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :aliases {"autotest" ["quickie"]}
  :profiles {:dev {:plugins [[quickie "0.4.1"]]
                   :dependencies [[pjstadig/humane-test-output "0.8.0"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]}})
