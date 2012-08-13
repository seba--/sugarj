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
    Fail16:
    { 
      IStrategoTerm term9 = term;
      Success9:
      { 
        Fail17:
        { 
          IStrategoTerm m_17 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail17;
          IStrategoTerm arg13 = term.getSubterm(0);
          if(arg13.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg13).isEmpty())
            break Fail17;
          m_17 = ((IStrategoList)arg13).head();
          IStrategoTerm arg14 = ((IStrategoList)arg13).tail();
          if(arg14.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg14).isEmpty())
            break Fail17;
          IStrategoTerm arg15 = term.getSubterm(1);
          if(arg15.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_1 != ((IStrategoAppl)arg15).getConstructor())
            break Fail17;
          IStrategoTerm arg16 = arg15.getSubterm(0);
          if(arg16.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg16).getConstructor())
            break Fail17;
          if(arg16.getSubterm(0) != m_17 && !m_17.match(arg16.getSubterm(0)))
            break Fail17;
          if(true)
            break Success9;
        }
        term = term9;
        IStrategoTerm h_17 = null;
        IStrategoTerm i_17 = null;
        IStrategoTerm j_17 = null;
        IStrategoTerm k_17 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail16;
        i_17 = term.getSubterm(0);
        IStrategoTerm arg17 = term.getSubterm(1);
        if(arg17.getTermType() != IStrategoTerm.APPL || renaming._consPackageOrTypeName_2 != ((IStrategoAppl)arg17).getConstructor())
          break Fail16;
        h_17 = arg17.getSubterm(0);
        IStrategoTerm arg18 = arg17.getSubterm(1);
        if(arg18.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg18).getConstructor())
          break Fail16;
        k_17 = arg18.getSubterm(0);
        term = split_last_0_0.instance.invoke(context, i_17);
        if(term == null)
          break Fail16;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail16;
        j_17 = term.getSubterm(0);
        if(term.getSubterm(1) != k_17 && !k_17.match(term.getSubterm(1)))
          break Fail16;
        term = termFactory.makeTuple(j_17, h_17);
        term = this.invoke(context, term);
        if(term == null)
          break Fail16;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}