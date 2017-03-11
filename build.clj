(require 'cljs.build.api)

(cljs.build.api/build "src" {:optimizations :whitespace :output-dir "out" :output-to "out/main.js" :source-map "out/main.js.map"})
