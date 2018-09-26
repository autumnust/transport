/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.stdudfs.examples.hive;

import com.google.common.collect.ImmutableList;
import com.linkedin.stdudfs.api.udf.StdUDF;
import com.linkedin.stdudfs.api.udf.TopLevelStdUDF;
import com.linkedin.stdudfs.examples.MapValuesFunction;
import com.linkedin.stdudfs.hive.StdUdfWrapper;
import java.util.List;


public class MapValuesFunctionWrapper extends StdUdfWrapper {
  @Override
  protected List<? extends StdUDF> getStdUdfImplementations() {
    return ImmutableList.of(new MapValuesFunction());
  }

  @Override
  protected Class<? extends TopLevelStdUDF> getTopLevelUdfClass() {
    return MapValuesFunction.class;
  }
}