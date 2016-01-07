(ns test.core.desktop-launcher
  (:require [test.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. test-game "test" 800 600)
  (Keyboard/enableRepeatEvents true))
