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
    Fail11:
    { 
      IStrategoTerm term9 = term;
      Success9:
      { 
        Fail12:
        { 
          IStrategoTerm p_14 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail12;
          IStrategoTerm arg10 = term.getSubterm(0);
          if(arg10.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg10).isEmpty())
            break Fail12;
          p_14 = ((IStrategoList)arg10).head();
          IStrategoTerm arg11 = ((IStrategoList)arg10).tail();
          if(arg11.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg11).isEmpty())
            break Fail12;
          IStrategoTerm arg12 = term.getSubterm(1);
          if(arg12.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_1 != ((IStrategoAppl)arg12).getConstructor())
            break Fail12;
          IStrategoTerm arg13 = arg12.getSubterm(0);
          if(arg13.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg13).getConstructor())
            break Fail12;
          if(arg13.getSubterm(0) != p_14 && !p_14.match(arg13.getSubterm(0)))
            break Fail12;
          if(true)
            break Success9;
        }
        term = term9;
        IStrategoTerm k_14 = null;
        IStrategoTerm l_14 = null;
        IStrategoTerm m_14 = null;
        IStrategoTerm n_14 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail11;
        l_14 = term.getSubterm(0);
        IStrategoTerm arg14 = term.getSubterm(1);
        if(arg14.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_2 != ((IStrategoAppl)arg14).getConstructor())
          break Fail11;
        k_14 = arg14.getSubterm(0);
        IStrategoTerm arg15 = arg14.getSubterm(1);
        if(arg15.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg15).getConstructor())
          break Fail11;
        m_14 = arg15.getSubterm(0);
        term = split_last_0_0.instance.invoke(context, l_14);
        if(term == null)
          break Fail11;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail11;
        if(term.getSubterm(0) != m_14 && !m_14.match(term.getSubterm(0)))
          break Fail11;
        n_14 = term.getSubterm(1);
        term = termFactory.makeTuple(n_14, k_14);
        term = this.invoke(context, term);
        if(term == null)
          break Fail11;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}