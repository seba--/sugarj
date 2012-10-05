module Launch (launch, getArgs, getDataFileName) where

import System.Cmd
import System.Environment

import Paths_sugarhaskell

launch lang = do
  args <- getArgs
  lib <- getDataFileName "lib"
  rawSystem "java" $
    ["-Xss16m", 
     "-Xmx1024m", 
     "-XX:MaxPermSize=256m",
     "-cp", 
     lib, 
     "org.sugarj.driver.cli.Main"]
    -- arguments to sugarj from here on
    ++ ["-l", lang]
    ++ args
