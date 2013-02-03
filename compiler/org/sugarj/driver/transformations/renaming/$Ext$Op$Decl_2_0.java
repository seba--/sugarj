package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_17, Strategy i_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDecl_2_0");
    Fail116:
    { 
      IStrategoTerm k_110 = null;
      IStrategoTerm i_110 = null;
      IStrategoTerm j_110 = null;
      IStrategoTerm l_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      i_110 = term.getSubterm(0);
      j_110 = term.getSubterm(1);
      IStrategoList annos104 = term.getAnnotations();
      k_110 = annos104;
      term = h_17.invoke(context, i_110);
      if(term == null)
        break Fail116;
      l_110 = term;
      term = i_17.invoke(context, j_110);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDecl_2, new IStrategoTerm[]{l_110, term}), checkListAnnos(termFactory, k_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}