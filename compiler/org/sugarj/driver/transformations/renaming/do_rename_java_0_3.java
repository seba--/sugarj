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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_49, IStrategoTerm h_49, IStrategoTerm i_49)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("do_rename_java_0_3");
    Fail11:
    { 
      IStrategoTerm term4 = term;
      IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success4:
      { 
        if(cons1 == out._consClassDecHead_5)
        { 
          Fail12:
          { 
            IStrategoTerm z_25 = null;
            IStrategoTerm a_26 = null;
            IStrategoTerm b_26 = null;
            IStrategoTerm c_26 = null;
            z_25 = term.getSubterm(0);
            IStrategoTerm arg3 = term.getSubterm(1);
            if(arg3.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg3).getConstructor())
              break Fail12;
            if(arg3.getSubterm(0) != h_49 && !h_49.match(arg3.getSubterm(0)))
              break Fail12;
            a_26 = term.getSubterm(2);
            b_26 = term.getSubterm(3);
            c_26 = term.getSubterm(4);
            term = termFactory.makeAppl(out._consClassDecHead_5, new IStrategoTerm[]{z_25, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49}), a_26, b_26, c_26});
            if(true)
              break Success4;
          }
          term = term4;
        }
        Success5:
        { 
          if(cons1 == out._consInterfaceDecHead_4)
          { 
            Fail13:
            { 
              IStrategoTerm t_25 = null;
              IStrategoTerm u_25 = null;
              IStrategoTerm v_25 = null;
              t_25 = term.getSubterm(0);
              IStrategoTerm arg4 = term.getSubterm(1);
              if(arg4.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg4).getConstructor())
                break Fail13;
              if(arg4.getSubterm(0) != h_49 && !h_49.match(arg4.getSubterm(0)))
                break Fail13;
              u_25 = term.getSubterm(2);
              v_25 = term.getSubterm(3);
              term = termFactory.makeAppl(out._consInterfaceDecHead_4, new IStrategoTerm[]{t_25, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49}), u_25, v_25});
              if(true)
                break Success5;
            }
            term = term4;
          }
          Success6:
          { 
            if(cons1 == out._consEnumDecHead_3)
            { 
              Fail14:
              { 
                IStrategoTerm o_25 = null;
                IStrategoTerm p_25 = null;
                o_25 = term.getSubterm(0);
                IStrategoTerm arg5 = term.getSubterm(1);
                if(arg5.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                  break Fail14;
                if(arg5.getSubterm(0) != h_49 && !h_49.match(arg5.getSubterm(0)))
                  break Fail14;
                p_25 = term.getSubterm(2);
                term = termFactory.makeAppl(out._consEnumDecHead_3, new IStrategoTerm[]{o_25, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49}), p_25});
                if(true)
                  break Success6;
              }
              term = term4;
            }
            Success7:
            { 
              if(cons1 == out._consAnnoDecHead_2)
              { 
                Fail15:
                { 
                  IStrategoTerm k_25 = null;
                  k_25 = term.getSubterm(0);
                  IStrategoTerm arg6 = term.getSubterm(1);
                  if(arg6.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg6).getConstructor())
                    break Fail15;
                  if(arg6.getSubterm(0) != h_49 && !h_49.match(arg6.getSubterm(0)))
                    break Fail15;
                  term = termFactory.makeAppl(out._consAnnoDecHead_2, new IStrategoTerm[]{k_25, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49})});
                  if(true)
                    break Success7;
                }
                term = term4;
              }
              Success8:
              { 
                if(cons1 == out._consConstrDecHead_5)
                { 
                  Fail16:
                  { 
                    IStrategoTerm d_25 = null;
                    IStrategoTerm e_25 = null;
                    IStrategoTerm f_25 = null;
                    IStrategoTerm g_25 = null;
                    d_25 = term.getSubterm(0);
                    e_25 = term.getSubterm(1);
                    IStrategoTerm arg7 = term.getSubterm(2);
                    if(arg7.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg7).getConstructor())
                      break Fail16;
                    if(arg7.getSubterm(0) != h_49 && !h_49.match(arg7.getSubterm(0)))
                      break Fail16;
                    f_25 = term.getSubterm(3);
                    g_25 = term.getSubterm(4);
                    term = termFactory.makeAppl(out._consConstrDecHead_5, new IStrategoTerm[]{d_25, e_25, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49}), f_25, g_25});
                    if(true)
                      break Success8;
                  }
                  term = term4;
                }
                Success9:
                { 
                  if(cons1 == out._consTypeName_1)
                  { 
                    Fail17:
                    { 
                      IStrategoTerm arg8 = term.getSubterm(0);
                      if(arg8.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                        break Fail17;
                      if(arg8.getSubterm(0) != h_49 && !h_49.match(arg8.getSubterm(0)))
                        break Fail17;
                      term = termFactory.makeAppl(out._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49})});
                      if(true)
                        break Success9;
                    }
                    term = term4;
                  }
                  Success10:
                  { 
                    if(cons1 == out._consTypeName_2)
                    { 
                      Fail18:
                      { 
                        IStrategoTerm v_24 = null;
                        v_24 = term.getSubterm(0);
                        IStrategoTerm arg9 = term.getSubterm(1);
                        if(arg9.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg9).getConstructor())
                          break Fail18;
                        if(arg9.getSubterm(0) != h_49 && !h_49.match(arg9.getSubterm(0)))
                          break Fail18;
                        term = termFactory.makeTuple(g_49, v_24);
                        term = match_pkgs_java_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail18;
                        term = termFactory.makeAppl(out._consTypeName_2, new IStrategoTerm[]{v_24, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49})});
                        if(true)
                          break Success10;
                      }
                      term = term4;
                    }
                    Success11:
                    { 
                      if(cons1 == out._consPackageOrTypeName_1)
                      { 
                        Fail19:
                        { 
                          IStrategoTerm arg10 = term.getSubterm(0);
                          if(arg10.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                            break Fail19;
                          if(arg10.getSubterm(0) != h_49 && !h_49.match(arg10.getSubterm(0)))
                            break Fail19;
                          term = termFactory.makeAppl(out._consPackageOrTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49})});
                          if(true)
                            break Success11;
                        }
                        term = term4;
                      }
                      Success12:
                      { 
                        if(cons1 == out._consPackageOrTypeName_2)
                        { 
                          Fail20:
                          { 
                            IStrategoTerm n_24 = null;
                            n_24 = term.getSubterm(0);
                            IStrategoTerm arg11 = term.getSubterm(1);
                            if(arg11.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg11).getConstructor())
                              break Fail20;
                            if(arg11.getSubterm(0) != h_49 && !h_49.match(arg11.getSubterm(0)))
                              break Fail20;
                            term = termFactory.makeTuple(g_49, n_24);
                            term = match_pkgs_java_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail20;
                            term = termFactory.makeAppl(out._consPackageOrTypeName_2, new IStrategoTerm[]{n_24, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49})});
                            if(true)
                              break Success12;
                          }
                          term = term4;
                        }
                        if(cons1 == out._consAmbName_1)
                        { 
                          IStrategoTerm arg12 = term.getSubterm(0);
                          if(arg12.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg12).getConstructor())
                            break Fail11;
                          if(arg12.getSubterm(0) != h_49 && !h_49.match(arg12.getSubterm(0)))
                            break Fail11;
                          term = termFactory.makeAppl(out._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{i_49})});
                        }
                        else
                        { 
                          break Fail11;
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