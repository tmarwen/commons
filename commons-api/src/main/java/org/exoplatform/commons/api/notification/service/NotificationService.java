/*
 * Copyright (C) 2003-2013 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU Affero General Public License
* as published by the Free Software Foundation; either version 3
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.commons.api.notification.service;

import java.util.Collection;
import java.util.List;

import org.exoplatform.commons.api.notification.NotificationContext;
import org.exoplatform.commons.api.notification.NotificationMessage;



public interface NotificationService {
  
  void addNotificationServiceListener(NotificationContext ctx);

  void addSendNotificationListener(NotificationMessage  message);

  void processNotificationMessage(NotificationMessage  message) ;
  
  void processNotificationMessages(Collection<NotificationMessage> messages);

  void saveNotificationMessage(NotificationMessage  message);
  
  NotificationMessage getNotificationMessageByProviderType(String providerType);
  
  List<NotificationMessage> getNotificationMessagesByUser(String userId);

}
