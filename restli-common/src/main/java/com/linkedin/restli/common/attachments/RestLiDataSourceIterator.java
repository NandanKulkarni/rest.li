/*
   Copyright (c) 2016 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.linkedin.restli.common.attachments;


/**
 * Interface to be used by classes which can produce multiple data sources instead of just a single
 * {@link com.linkedin.restli.common.attachments.RestLiAttachmentDataSourceWriter}
 *
 * @author Karim Vidhani
 */
public interface RestLiDataSourceIterator
{
  /**
   * Invoked when all the potential data sources that this RestLiDataSourceIterator represents need to be abandoned
   * since they will not give given a chance to produce data.
   */
  public void abandonAllDataSources();

  /**
   * Invoked as the first step to walk through all potential data sources represented by this RestLiDataSourceIterator.
   *
   * @param callback the callback that will be invoked as data sources become available for consumption.
   */
  public void registerDataSourceReaderCallback(final RestLiDataSourceIteratorCallback callback);
}
