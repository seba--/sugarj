module Launch (launch, getArgs, getDataFileName) where

import System.Cmd
import System.Environment

import Paths_sugarhaskell

-- launch :: String -> [String] -> IO <something GHC-specific>
launch lib args =
  rawSystem "java" $
    ["-Xss16m", 
     "-Xmx1024m", 
     "-XX:MaxPermSize=256m",
     "-cp", 
     lib, 
     "org.sugarj.driver.cli.Main"]
    -- arguments to sugarj from here on
    ++ args
