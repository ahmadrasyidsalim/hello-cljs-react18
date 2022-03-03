(ns hello-cljs-react18.core
  (:require react-dom))

(def container (.getElementById js/document "app"))
(def root (.createRoot js/ReactDOM container))
(.render root (.createElement js/React "h2" nil "Hello, React!"))
