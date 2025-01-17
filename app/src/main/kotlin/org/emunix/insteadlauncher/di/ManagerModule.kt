/*
 * Copyright (c) 2021 Boris Timofeev <btimofeev@emunix.org>
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */

package org.emunix.insteadlauncher.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.emunix.insteadlauncher.manager.game.GameManager
import org.emunix.insteadlauncher.manager.game.GameManagerImpl
import org.emunix.insteadlauncher.manager.repository.RepositoryManager
import org.emunix.insteadlauncher.manager.repository.RepositoryManagerImpl

@InstallIn(SingletonComponent::class)
@Module
interface ManagerModule {

    @Binds
    fun bindGameManager(impl: GameManagerImpl): GameManager

    @Binds
    fun bindRepositoryManager(impl: RepositoryManagerImpl): RepositoryManager
}