(ns ritz-cw.example
  ;; (:require [])
  )

;;; simple evaluation with exceptions

;; Default - no popup in repl
;; (setq nrepl-popup-stacktraces t)
;; (setq nrepl-popup-stacktraces-in-repl nil)

;; Popup stack trace
;; (setq nrepl-popup-stacktraces-in-repl t)

#_ (/ 1 0)

;; Stop stack unwinding
;; M-x nrepl-ritz-break-on-exception

;; lein pom
;; mvn dependency:sources


(defn f1 []
  (let [a 1]
    (/ a 0)))

#_ (f1)


(defn f5 []
  (let [c (range 1000)]
    (first c)
    (second c)))

#_ (f5)


(defn f6 []
  (let [c (range 10)]
    (/ (first c) 0)))

#_ (f6)


;;; Tracking down errors
(comment
  (defmulti fred [x] x))

(comment
  (ns fred
    (:use
     [clojure.string :only join])))


(defn f2 []
  (let [a (map inc (range 1000))]
    (/ (first a) 0)))

;; (comment (f2))

;;; Lazy sequences
(defn f3 []
  (let [a (range 10000)]
    (/ (first a) 0)))

;; (comment (f3))


;;; Locals clearing
(defn f4 []
  (let [b (range 10)
        c (map inc b)]
    (f1)))

;; (comment (f4))

;; (defn String capitalise [s]
;;   s)







(defn get-some-key [m]
  (select-keys m :some-key))

;; (get-some-key {})
