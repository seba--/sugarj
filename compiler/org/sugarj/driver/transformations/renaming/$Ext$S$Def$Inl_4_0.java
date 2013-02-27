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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_12, Strategy w_12, Strategy x_12, Strategy y_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDefInl_4_0");
    Fail55:
    { 
      IStrategoTerm x_98 = null;
      IStrategoTerm s_98 = null;
      IStrategoTerm t_98 = null;
      IStrategoTerm v_98 = null;
      IStrategoTerm w_98 = null;
      IStrategoTerm y_98 = null;
      IStrategoTerm z_98 = null;
      IStrategoTerm a_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtSDefInl_4 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      s_98 = term.getSubterm(0);
      t_98 = term.getSubterm(1);
      v_98 = term.getSubterm(2);
      w_98 = term.getSubterm(3);
      IStrategoList annos45 = term.getAnnotations();
      x_98 = annos45;
      term = v_12.invoke(context, s_98);
      if(term == null)
        break Fail55;
      y_98 = term;
      term = w_12.invoke(context, t_98);
      if(term == null)
        break Fail55;
      z_98 = term;
      term = x_12.invoke(context, v_98);
      if(term == null)
        break Fail55;
      a_99 = term;
      term = y_12.invoke(context, w_98);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtSDefInl_4, new IStrategoTerm[]{y_98, z_98, a_99, term}), checkListAnnos(termFactory, x_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}