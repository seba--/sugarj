package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl$Q_2_0 extends Strategy 
{ 
  public static $Ext$Op$Decl$Q_2_0 instance = new $Ext$Op$Decl$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_17, Strategy g_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclQ_2_0");
    Fail115:
    { 
      IStrategoTerm f_110 = null;
      IStrategoTerm d_110 = null;
      IStrategoTerm e_110 = null;
      IStrategoTerm g_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail115;
      d_110 = term.getSubterm(0);
      e_110 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      f_110 = annos103;
      term = f_17.invoke(context, d_110);
      if(term == null)
        break Fail115;
      g_110 = term;
      term = g_17.invoke(context, e_110);
      if(term == null)
        break Fail115;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclQ_2, new IStrategoTerm[]{g_110, term}), checkListAnnos(termFactory, f_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}