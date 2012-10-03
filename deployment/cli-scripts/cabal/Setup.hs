import Distribution.Simple(defaultMainWithHooks, simpleUserHooks, UserHooks(instHook,sDistHook), compilerId)
import Distribution.Simple.LocalBuildInfo(LocalBuildInfo(compiler,installDirTemplates,withPrograms), absoluteInstallDirs)
import Distribution.Simple.InstallDirs(InstallDirs(..), initialPathTemplateEnv, fromPathTemplate)
import Distribution.Simple.Program ( defaultProgramConfiguration, requireProgram,
                              rawSystemProgram, tarProgram )
import Distribution.Simple.Setup(InstallFlags,SDistFlags,CopyDest(..))

import Distribution.Package
import Distribution.PackageDescription
import Distribution.Text (Text(..))
import Distribution.Verbosity

import System.Directory
import System.Environment(getArgs)
import System.FilePath((</>), (<.>), takeFileName)
import System.IO(openTempFile, hClose)
import Control.Applicative((<$>))
import Control.Exception(throw)
import Control.Monad(when,forM_)


main = defaultMainWithHooks hooks
  where
    hooks = defaultHooks { instHook = installDataDir, sDistHook = tarballAll  }


defaultHooks = simpleUserHooks

installDataDir :: PackageDescription -> LocalBuildInfo -> UserHooks -> InstallFlags -> IO ()
installDataDir desc info hooks flags =
  let origDataDir = dataDir desc
      dirName = takeFileName origDataDir
      destDataDir = cabalDataDir </> dirName in do
  -- putStrLn $ "desc: " ++ show desc  
  -- putStrLn $ "info: " ++ show info
  -- putStrLn $ "flags: " ++ show flags
  
  putStrLn $ "Installing SugarHaskell dependencies to " ++ destDataDir ++ " ..."
  copyDir origDataDir destDataDir
  instHook defaultHooks desc info hooks flags
  
  where 
    absInstallDirs = absoluteInstallDirs desc info NoCopyDest
    InstallDirs {datadir = cabalDataDir} = absInstallDirs

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
    whenM s r = s >>= flip when r


tarballAll :: PackageDescription -> Maybe LocalBuildInfo -> UserHooks -> SDistFlags -> IO ()
tarballAll desc minfo _ _ = do
  putStrLn "Prepare distribution of SugarHaskel..."
  
  pwd <- getCurrentDirectory
  tmpDir <- mkTempDir "sugarhaskell.tar.gz"
  let tarName = tarBallName desc
  let sourceDir = tmpDir </> tarName
  
  copyDir pwd sourceDir
      
  let tarBallDir = pwd </> "dist"
  createDirectoryIfMissing True tarBallDir
  let tarBallFilePath = tarBallDir </> tarName <.> "tar.gz"
  
  createArchive minfo tmpDir tarName tarBallFilePath
  
  where
    tarBallName = show . disp . packageId
  
createArchive minfo contextDir inDir out = do
  (tarProg, _) <- requireProgram normal tarProgram
                    (maybe defaultProgramConfiguration withPrograms minfo)
  rawSystemProgram normal tarProg
           ["-C", contextDir, "-czf", out, inDir]

mkTempDir :: String -> IO FilePath
mkTempDir s = do 
  tmpDir <- getTemporaryDirectory
  let path = tmpDir </> s
  (path, handle) <- openTempFile tmpDir s
  hClose handle  
  removeFile path
  createDirectory path
  return path
