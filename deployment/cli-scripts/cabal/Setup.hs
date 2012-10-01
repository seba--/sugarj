import System.Directory
import System.FilePath((</>))
import Control.Applicative((<$>))
import Control.Exception(throw)
import Control.Monad(when,forM_)

import Paths_sugarhaskell

main = do
  let origlib = getCurrentDirectory </> "lib"
  destlib <- getDataFileName "lib"
  putStrLn $ "copy " origlib ++ " -> " ++ destlib
  copyDir "lib" lib
  defaultMain
  
  
-- copied from http://stackoverflow.com/questions/6807025/what-is-the-haskell-way-to-copy-a-directory
copyDir ::  FilePath -> FilePath -> IO ()
copyDir src dst = do
  whenM (not <$> doesDirectoryExist src) $
    throw (userError "source does not exist")

  createDirectoryIfMissing True dst
  content <- getDirectoryContents src
  let xs = filter (`notElem` [".", ".."]) content
  forM_ xs $ \name -> do
    let srcPath = src </> name
    let dstPath = dst </> name
    isDirectory <- doesDirectoryExist srcPath
    if isDirectory
      then copyDir srcPath dstPath
      else copyFile srcPath dstPath

  where
    doesFileOrDirectoryExist x = orM [doesDirectoryExist x, doesFileExist x]
    orM xs = or <$> sequence xs
    whenM s r = s >>= flip when r