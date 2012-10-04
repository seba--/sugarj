module Main where

import Launch

main = do
  args <- getArgs
  lib <- getDataFileName "lib"
  launch lib ("-l" : "java" : args)
