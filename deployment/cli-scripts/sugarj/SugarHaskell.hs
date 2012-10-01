module Main where

import Paths_sugarhaskell

main = do
  lib <- getDataFileName
  putStrLn $ show lib
