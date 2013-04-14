package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$S$Def$Inl_4_0 extends Strategy 
{ 
  public static $Ext$S$Def$Inl_4_0 instance = new $Ext$S$Def$Inl_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_13, Strategy c_13, Strategy d_13, Strategy e_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail54:
    { 
      IStrategoTerm d_99 = null;
      IStrategoTerm z_98 = null;
      IStrategoTerm a_99 = null;
      IStrategoTerm b_99 = null;
      IStrategoTerm c_99 = null;
      IStrategoTerm e_99 = null;
      IStrategoTerm f_99 = null;
      IStrategoTerm g_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      z_98 = term.getSubterm(0);
      a_99 = term.getSubterm(1);
      b_99 = term.getSubterm(2);
      c_99 = term.getSubterm(3);
      IStrategoList annos45 = term.getAnnotations();
      d_99 = annos45;
      term = b_13.invoke(context, z_98);
      if(term == null)
        break Fail54;
      e_99 = term;
      term = c_13.invoke(context, a_99);
      if(term == null)
        break Fail54;
      f_99 = term;
      term = d_13.invoke(context, b_99);
      if(term == null)
        break Fail54;
      g_99 = term;
      term = e_13.invoke(context, c_99);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDefInl_4, new IStrategoTerm[]{e_99, f_99, g_99, term}), checkListAnnos(termFactory, d_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}