package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_pkgs_java_0_0 extends Strategy 
{ 
  public static match_pkgs_java_0_0 instance = new match_pkgs_java_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("match_pkgs_java_0_0");
    Fail6:
    { 
      IStrategoTerm term4 = term;
      Success4:
      { 
        Fail7:
        { 
          IStrategoTerm s_13 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail7;
          IStrategoTerm arg5 = term.getSubterm(0);
          if(arg5.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5).isEmpty())
            break Fail7;
          s_13 = ((IStrategoList)arg5).head();
          IStrategoTerm arg6 = ((IStrategoList)arg5).tail();
          if(arg6.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6).isEmpty())
            break Fail7;
          IStrategoTerm arg7 = term.getSubterm(1);
          if(arg7.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_1 != ((IStrategoAppl)arg7).getConstructor())
            break Fail7;
          IStrategoTerm arg8 = arg7.getSubterm(0);
          if(arg8.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg8).getConstructor())
            break Fail7;
          if(arg8.getSubterm(0) != s_13 && !s_13.match(arg8.getSubterm(0)))
            break Fail7;
          if(true)
            break Success4;
        }
        term = term4;
        IStrategoTerm n_13 = null;
        IStrategoTerm o_13 = null;
        IStrategoTerm p_13 = null;
        IStrategoTerm q_13 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail6;
        o_13 = term.getSubterm(0);
        IStrategoTerm arg9 = term.getSubterm(1);
        if(arg9.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_2 != ((IStrategoAppl)arg9).getConstructor())
          break Fail6;
        n_13 = arg9.getSubterm(0);
        IStrategoTerm arg10 = arg9.getSubterm(1);
        if(arg10.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg10).getConstructor())
          break Fail6;
        p_13 = arg10.getSubterm(0);
        term = split_last_0_0.instance.invoke(context, o_13);
        if(term == null)
          break Fail6;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail6;
        if(term.getSubterm(0) != p_13 && !p_13.match(term.getSubterm(0)))
          break Fail6;
        q_13 = term.getSubterm(1);
        term = termFactory.makeTuple(q_13, n_13);
        term = this.invoke(context, term);
        if(term == null)
          break Fail6;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}