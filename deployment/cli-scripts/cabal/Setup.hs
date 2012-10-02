import Distribution.Simple(defaultMainWithHooks, simpleUserHooks, UserHooks(instHook), compilerId)
import Distribution.Simple.LocalBuildInfo(LocalBuildInfo(compiler,installDirTemplates), substituteInstallDirTemplates)
import Distribution.Simple.InstallDirs(InstallDirs(datadir), absoluteInstallDirs, initialPathTemplateEnv, fromPathTemplate)
import Distribution.Simple.Setup(InstallFlags)
import Distribution.PackageDescription
import Distribution.Text (Text(..))

import System.Directory
import System.Environment(getArgs)
import System.FilePath((</>), takeFileName)
import Control.Applicative((<$>))
import Control.Exception(throw)
import Control.Monad(when,forM_)


main = defaultMainWithHooks hooks
  where
    hooks = defaultHooks { instHook = installDataDir }

defaultHooks = simpleUserHooks

installDataDir :: PackageDescription -> LocalBuildInfo -> UserHooks -> InstallFlags -> IO ()
installDataDir desc info hooks flags =
  let origDataDir = dataDir desc
      dirName = takeFileName origDataDir
      cabalDataDir = fromPathTemplate $ datadir absInstallDirs 
      packageDataDir = cabalDataDir </> pkgId
      destDataDir = packageDataDir </> dirName in do
  putStrLn $ "Installing SugarHaskell dependencies to " ++ destDataDir ++ " ..."
  copyDir origDataDir destDataDir
  instHook defaultHooks desc info hooks flags
  
  where 
    pkg = package desc
    pkgId = show $ disp $ pkg
    comp = compilerId $ compiler info
     
    env = initialPathTemplateEnv pkg comp
    installDirs = installDirTemplates info
    absInstallDirs = substituteInstallDirTemplates env installDirs

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