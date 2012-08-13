package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class do_rename_java_0_3 extends Strategy 
{ 
  public static do_rename_java_0_3 instance = new do_rename_java_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_32, IStrategoTerm f_32, IStrategoTerm g_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("do_rename_java_0_3");
    Fail6:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == renaming._consClassDecHead_5)
        { 
          Fail7:
          { 
            IStrategoTerm d_17 = null;
            IStrategoTerm e_17 = null;
            IStrategoTerm f_17 = null;
            IStrategoTerm g_17 = null;
            d_17 = term.getSubterm(0);
            IStrategoTerm arg3 = term.getSubterm(1);
            if(arg3.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg3).getConstructor())
              break Fail7;
            if(arg3.getSubterm(0) != f_32 && !f_32.match(arg3.getSubterm(0)))
              break Fail7;
            e_17 = term.getSubterm(2);
            f_17 = term.getSubterm(3);
            g_17 = term.getSubterm(4);
            term = termFactory.makeAppl(renaming._consClassDecHead_5, new IStrategoTerm[]{d_17, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32}), e_17, f_17, g_17});
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == renaming._consInterfaceDecHead_4)
          { 
            Fail8:
            { 
              IStrategoTerm x_16 = null;
              IStrategoTerm y_16 = null;
              IStrategoTerm z_16 = null;
              x_16 = term.getSubterm(0);
              IStrategoTerm arg4 = term.getSubterm(1);
              if(arg4.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg4).getConstructor())
                break Fail8;
              if(arg4.getSubterm(0) != f_32 && !f_32.match(arg4.getSubterm(0)))
                break Fail8;
              y_16 = term.getSubterm(2);
              z_16 = term.getSubterm(3);
              term = termFactory.makeAppl(renaming._consInterfaceDecHead_4, new IStrategoTerm[]{x_16, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32}), y_16, z_16});
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == renaming._consEnumDecHead_3)
            { 
              Fail9:
              { 
                IStrategoTerm s_16 = null;
                IStrategoTerm t_16 = null;
                s_16 = term.getSubterm(0);
                IStrategoTerm arg5 = term.getSubterm(1);
                if(arg5.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                  break Fail9;
                if(arg5.getSubterm(0) != f_32 && !f_32.match(arg5.getSubterm(0)))
                  break Fail9;
                t_16 = term.getSubterm(2);
                term = termFactory.makeAppl(renaming._consEnumDecHead_3, new IStrategoTerm[]{s_16, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32}), t_16});
                if(true)
                  break Success2;
              }
              term = term0;
            }
            Success3:
            { 
              if(cons0 == renaming._consAnnoDecHead_2)
              { 
                Fail10:
                { 
                  IStrategoTerm o_16 = null;
                  o_16 = term.getSubterm(0);
                  IStrategoTerm arg6 = term.getSubterm(1);
                  if(arg6.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg6).getConstructor())
                    break Fail10;
                  if(arg6.getSubterm(0) != f_32 && !f_32.match(arg6.getSubterm(0)))
                    break Fail10;
                  term = termFactory.makeAppl(renaming._consAnnoDecHead_2, new IStrategoTerm[]{o_16, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32})});
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              Success4:
              { 
                if(cons0 == renaming._consConstrDecHead_5)
                { 
                  Fail11:
                  { 
                    IStrategoTerm h_16 = null;
                    IStrategoTerm i_16 = null;
                    IStrategoTerm j_16 = null;
                    IStrategoTerm k_16 = null;
                    h_16 = term.getSubterm(0);
                    i_16 = term.getSubterm(1);
                    IStrategoTerm arg7 = term.getSubterm(2);
                    if(arg7.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg7).getConstructor())
                      break Fail11;
                    if(arg7.getSubterm(0) != f_32 && !f_32.match(arg7.getSubterm(0)))
                      break Fail11;
                    j_16 = term.getSubterm(3);
                    k_16 = term.getSubterm(4);
                    term = termFactory.makeAppl(renaming._consConstrDecHead_5, new IStrategoTerm[]{h_16, i_16, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32}), j_16, k_16});
                    if(true)
                      break Success4;
                  }
                  term = term0;
                }
                Success5:
                { 
                  if(cons0 == renaming._consTypeName_1)
                  { 
                    Fail12:
                    { 
                      IStrategoTerm arg8 = term.getSubterm(0);
                      if(arg8.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                        break Fail12;
                      if(arg8.getSubterm(0) != f_32 && !f_32.match(arg8.getSubterm(0)))
                        break Fail12;
                      term = termFactory.makeAppl(renaming._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32})});
                      if(true)
                        break Success5;
                    }
                    term = term0;
                  }
                  Success6:
                  { 
                    if(cons0 == renaming._consTypeName_2)
                    { 
                      Fail13:
                      { 
                        IStrategoTerm z_15 = null;
                        z_15 = term.getSubterm(0);
                        IStrategoTerm arg9 = term.getSubterm(1);
                        if(arg9.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg9).getConstructor())
                          break Fail13;
                        if(arg9.getSubterm(0) != f_32 && !f_32.match(arg9.getSubterm(0)))
                          break Fail13;
                        term = termFactory.makeTuple(e_32, z_15);
                        term = match_pkgs_java_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail13;
                        term = termFactory.makeAppl(renaming._consTypeName_2, new IStrategoTerm[]{z_15, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32})});
                        if(true)
                          break Success6;
                      }
                      term = term0;
                    }
                    Success7:
                    { 
                      if(cons0 == renaming._consPackageOrTypeName_1)
                      { 
                        Fail14:
                        { 
                          IStrategoTerm arg10 = term.getSubterm(0);
                          if(arg10.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                            break Fail14;
                          if(arg10.getSubterm(0) != f_32 && !f_32.match(arg10.getSubterm(0)))
                            break Fail14;
                          term = termFactory.makeAppl(renaming._consPackageOrTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32})});
                          if(true)
                            break Success7;
                        }
                        term = term0;
                      }
                      Success8:
                      { 
                        if(cons0 == renaming._consPackageOrTypeName_2)
                        { 
                          Fail15:
                          { 
                            IStrategoTerm r_15 = null;
                            r_15 = term.getSubterm(0);
                            IStrategoTerm arg11 = term.getSubterm(1);
                            if(arg11.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg11).getConstructor())
                              break Fail15;
                            if(arg11.getSubterm(0) != f_32 && !f_32.match(arg11.getSubterm(0)))
                              break Fail15;
                            term = termFactory.makeTuple(e_32, r_15);
                            term = match_pkgs_java_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail15;
                            term = termFactory.makeAppl(renaming._consPackageOrTypeName_2, new IStrategoTerm[]{r_15, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32})});
                            if(true)
                              break Success8;
                          }
                          term = term0;
                        }
                        if(cons0 == renaming._consAmbName_1)
                        { 
                          IStrategoTerm arg12 = term.getSubterm(0);
                          if(arg12.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg12).getConstructor())
                            break Fail6;
                          if(arg12.getSubterm(0) != f_32 && !f_32.match(arg12.getSubterm(0)))
                            break Fail6;
                          term = termFactory.makeAppl(renaming._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{g_32})});
                        }
                        else
                        { 
                          break Fail6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}