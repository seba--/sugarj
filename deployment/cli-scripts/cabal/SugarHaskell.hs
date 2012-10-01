module Main where

import System.Cmd
import System.Environment

import Paths_sugarhaskell

main = do
  args <- getArgs
  lib <- getDataFileName "lib"
  putStrLn $ show lib
  rawSystem "java" $
    ["-Xss64m", 
     "-Xmx1024m", 
     "-cp", 
     lib, 
     "org.sugarj.driver.cli.Main"]
    ++ args
