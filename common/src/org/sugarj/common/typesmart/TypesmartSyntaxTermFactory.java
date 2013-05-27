package org.sugarj.common.typesmart;

import java.util.Arrays;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.attachments.AbstractWrappedTermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoException;
import org.strategoxt.lang.typesmart.TypesmartSortAttachment;
import org.strategoxt.lang.typesmart.TypesmartTermFactory;

/**
 * Adds caching caching to {@link TypesmartTermFactory} tailored to typesmart syntax.
 * 
 * @author Sebastian Erdweg
 */
public class TypesmartSyntaxTermFactory extends TypesmartTermFactory {

  private class Key {
    private final String ctr;
    private final IStrategoTerm[] argsorts;
    
    public Key(IStrategoTerm ctr, IStrategoTerm[] args) {
      this.ctr = ctr.toString();
      this.argsorts = new IStrategoTerm[args.length];
      for (int i = 0; i < args.length; i++)
        this.argsorts[i] = getSort(args[i]);
    }

    private IStrategoTerm getSort(IStrategoTerm term) {
      IStrategoTerm sort;
      
      if ((sort = TypesmartSortAttachment.getSort(term)) != null)
        return sort;
      
      switch (term.getTermType()) {
      case IStrategoTerm.STRING:
        return getWrappedFactory().makeString("");
      case IStrategoTerm.INT:
        return getWrappedFactory().makeInt(0);
      case IStrategoTerm.LIST:
        return getWrappedFactory().makeList(getSortList(term.getAllSubterms()));
      case IStrategoTerm.TUPLE:
        return getWrappedFactory().makeTuple(getSortList(term.getAllSubterms()));
      case IStrategoTerm.BLOB:
        return getWrappedFactory().makeString(term.getClass().getCanonicalName());
      default:
        return getWrappedFactory().makeString("NoSort");
      }
    }
    
    private IStrategoTerm[] getSortList(IStrategoTerm[] terms) {
      for (int i = 0; i < terms.length; i++)
        terms[i] = getSort(terms[i]);
      return terms;
    }

    @Override
    public int hashCode() {
      return 31 * ctr.hashCode() + Arrays.hashCode(argsorts);
    }
    
    @Override
    public boolean equals(Object o) {
      return o instanceof Key 
          && ((Key) o).ctr.equals(ctr)
          && Arrays.equals(((Key) o).argsorts, argsorts);
    }
  }
  
  private final static Ehcache cache;
  static {
    CacheManager.getInstance().addCache("typesmart-syntax");
    cache = CacheManager.getInstance().getEhcache("typesmart-syntax");
  }
  
  /*
   * cache statistics are per instance
   */
  public int cacheHits = 0;
  public int cacheMisses = 0;

  /**
   * FIXME Clone of {@link TypesmartTermFactory#registerTypesmartFactory(Context, ITermFactory)}. Needed because of class extension.
   * @param context
   * @param factory
   * @return
   */
  public static ITermFactory registerTypesmartFactory(Context context, ITermFactory factory) {
    if (isTypeSmart(factory)) {
      return factory;
    }
    if (factory instanceof AbstractWrappedTermFactory) {
      ITermFactory oldBaseFactory = ((AbstractWrappedTermFactory) factory).getWrappedFactory(true);
      ((AbstractWrappedTermFactory) factory).replaceBaseFactory(new TypesmartTermFactory(context, oldBaseFactory), true);
      return factory;
    }
    return new TypesmartSyntaxTermFactory(context, factory);
  }

  public TypesmartSyntaxTermFactory(Context context, ITermFactory baseFactory) {
    super(context, baseFactory);
  }

  @Override
  public IStrategoAppl makeAppl(IStrategoConstructor ctr, IStrategoTerm[] kids, IStrategoList annotations) {
    // if there is no typesmart constructor for `ctr`, simply call super.makeAppl(..)
    try {
      if (tryGetTypesmartConstructorCall(ctr, kids) == null)
        return super.makeAppl(ctr, kids, annotations);
    } catch (InterpreterException e) {
      throw new StrategoException("Type-unsafe constructor application " + ctr, e);
    }
    
    Key key = new Key(ctr, kids);
    Element el = cache.get(key);
    if (el != null && !el.isExpired()) {
      cacheHits++;
      IStrategoAppl appl = makeUnsafeAppl(ctr, kids, annotations);
      TypesmartSortAttachment.put(appl, (IStrategoTerm) el.getObjectValue());
      return appl;
    }
    
    cacheMisses++;
    IStrategoAppl appl = super.makeAppl(ctr, kids, annotations);
    IStrategoTerm sort = TypesmartSortAttachment.getSort(appl);
    if (sort != null)
      cache.put(new Element(key, sort));
    
    return appl;
  }
}
