//package com.gildedrose;
//
//import org.approvaltests.testcommitrevert.GitCommitOrRevert;
//import org.approvaltests.testcommitrevert.TestCommitRevertRunner;
//import org.junit.runners.model.InitializationError;
//
//import com.spun.util.ObjectUtils;
//import com.spun.util.io.FileUtils;
//
//public class FasterTestCommitRevertRunner extends TestCommitRevertRunner
//{
//  public FasterTestCommitRevertRunner(Class<?> klass) throws InitializationError
//  {
//    super(klass);
//  }
//  static
//  {
//    GitCommitOrRevert.askForCommitMessage = () -> {
//      try
//      {
//        Process exec = Runtime.getRuntime().exec("osascript /Users/llewellyn/Dialog.scpt");
//        exec.waitFor();
//        return FileUtils.readStream(exec.getInputStream());
//      }
//      catch (Exception e)
//      {
//        throw ObjectUtils.throwAsError(e);
//      }
//    };
//  }
//}
