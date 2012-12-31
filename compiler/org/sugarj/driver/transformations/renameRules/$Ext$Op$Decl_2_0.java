package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl_2_0 extends Strategy 
{ 
  public static $Ext$Op$Decl_2_0 instance = new $Ext$Op$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_17, Strategy d_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDecl_2_0");
    Fail113:
    { 
      IStrategoTerm f_110 = null;
      IStrategoTerm d_110 = null;
      IStrategoTerm e_110 = null;
      IStrategoTerm g_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      d_110 = term.getSubterm(0);
      e_110 = term.getSubterm(1);
      IStrategoList annos104 = term.getAnnotations();
      f_110 = annos104;
      term = c_17.invoke(context, d_110);
      if(term == null)
        break Fail113;
      g_110 = term;
      term = d_17.invoke(context, e_110);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDecl_2, new IStrategoTerm[]{g_110, term}), checkListAnnos(termFactory, f_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}