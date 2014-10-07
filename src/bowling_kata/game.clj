(ns bowling-kata.game)

(defn score
  [scores]
  (loop [[f & more] scores
         frame 1
         acc 0]
    (cond
      (< 10 frame)
      acc
      (nil? more)
      (+ f acc)
      (= f 10)
      (recur more (inc frame) (+ acc 10 (first more) (second more)))
      (= (+ f (first more)) 10)
      (recur (rest more) (inc frame) (+ acc 10 (second more)))
      :else
      (recur (rest more) (inc frame) (+ acc f (first more))))))
