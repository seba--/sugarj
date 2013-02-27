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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_12, Strategy z_12, Strategy a_13, Strategy b_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail55:
    { 
      IStrategoTerm a_99 = null;
      IStrategoTerm w_98 = null;
      IStrategoTerm x_98 = null;
      IStrategoTerm y_98 = null;
      IStrategoTerm z_98 = null;
      IStrategoTerm b_99 = null;
      IStrategoTerm c_99 = null;
      IStrategoTerm d_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      w_98 = term.getSubterm(0);
      x_98 = term.getSubterm(1);
      y_98 = term.getSubterm(2);
      z_98 = term.getSubterm(3);
      IStrategoList annos45 = term.getAnnotations();
      a_99 = annos45;
      term = y_12.invoke(context, w_98);
      if(term == null)
        break Fail55;
      b_99 = term;
      term = z_12.invoke(context, x_98);
      if(term == null)
        break Fail55;
      c_99 = term;
      term = a_13.invoke(context, y_98);
      if(term == null)
        break Fail55;
      d_99 = term;
      term = b_13.invoke(context, z_98);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDefInl_4, new IStrategoTerm[]{b_99, c_99, d_99, term}), checkListAnnos(termFactory, a_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}