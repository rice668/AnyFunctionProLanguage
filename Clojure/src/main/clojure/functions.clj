(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(println(average[1 2 3 4 90]))

(defn hello
  [name]
  (println "Hellos," name))

(hello "Andrew")

(def vowel? (set "aeiou"))

;; 高度内嵌的函数是非常难懂得，千万不要这么写，可以使用let来帮助,把匿名函数传递给命名函
;; 数是非常常见的，但是不要把一个匿名函数传递给另外一个匿名函数, 这样代码就很难懂了。

(defn pig-latin [word]
  (let [first-letter (first word)] ; assigns a local binding
    (if (vowel? first-letter)
      (str word "ay") ; then part of if
      (str (subs word 1) first-letter "ay")))) ; else part of if

(println (pig-latin "red"))
(println (pig-latin "orange"))

(def ^:dynamic v 1) ; v is a global binding

(defn f1 []
  (println "f1: v =" v)) ; global binding

(defn f2 []
  (println "f2: before let v =" v) ; global binding
  (let [v 2] ; creates local binding v that shadows global one
    (println "f2: in let, v =" v) ; local binding
    (f1))
  (println "f2: after let v =" v)) ; global binding

(defn f3 []
  (println "f3: before binding v =" v) ; global binding
  (binding [v 3] ; same global binding with new, temporary value
    (println "f3: in binding, v =" v) ; global binding
    (f1))
  (println "f3: after binding v =" v)) ; global binding

(defn f4 []
  (def v 4)) ; changes the value of the global binding

(f2)
(f3)
(f4)
(println "after calling f4, v =" v)