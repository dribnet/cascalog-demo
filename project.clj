(defproject cascalog-demo "1.0.0-SNAPSHOT"
  :source-path "src/clj"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [cascalog "1.8.6"]
                 ]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]]
  :aot [cascalog-demo.demo])
