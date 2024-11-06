//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: XRPUSDT_30Min_1BOL_17f6745f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1BOL_17f6745f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_17f6745f(BBupper, BBlower, crossover_rsi_bblowerInt, vrsi, dif_source_BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dif_source_BBupper <= -0.143128 )
		if( dif_source_BBlower <= 0.11267 )
			if( dif_source_BBupper <= -0.256591 )
				if( vrsi <= 44.6946 )
					if( BBlower <= 1.47949 )
						if( vrsi <= 39.6469 )
							if( BBlower <= 0.801463 )
								if( BBupper <= 1.32183 )
									ret := 0.164474
								if( BBupper > 1.32183 )
									ret := -0.777778 // sell
							if( BBlower > 0.801463 )
								if( dif_source_BBlower <= 0.103858 )
									ret := 0.493573
								if( dif_source_BBlower > 0.103858 )
									ret := -0.083333
						if( vrsi > 39.6469 )
							if( BBupper <= 1.42737 )
								if( dif_source_BBlower <= -0.019198 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -0.019198 )
									ret := 0.062500
							if( BBupper > 1.42737 )
								if( BBlower <= 1.1595 )
									ret := 0.173913
								if( BBlower > 1.1595 )
									ret := -0.461538
					if( BBlower > 1.47949 )
						if( BBlower <= 1.52696 )
							if( dif_source_BBupper <= -0.306742 )
								if( BBupper <= 1.89283 )
									ret := -1.000000 // sell
								if( BBupper > 1.89283 )
									ret := -0.500000
							if( dif_source_BBupper > -0.306742 )
								ret := 0.000000
						if( BBlower > 1.52696 )
							if( vrsi <= 17.5272 )
								ret := 1.000000 // buy
							if( vrsi > 17.5272 )
								ret := -0.571429
				if( vrsi > 44.6946 )
					if( vrsi <= 47.2886 )
						if( BBupper <= 0.648768 )
							ret := -0.200000
						if( BBupper > 0.648768 )
							if( dif_source_BBlower <= 0.103219 )
								if( BBlower <= 0.850486 )
									ret := 0.700000 // buy
								if( BBlower > 0.850486 )
									ret := 1.000000 // buy
							if( dif_source_BBlower > 0.103219 )
								ret := 0.333333
					if( vrsi > 47.2886 )
						if( BBlower <= 0.376303 )
							if( dif_source_BBupper <= -0.404273 )
								ret := 0.285714
							if( dif_source_BBupper > -0.404273 )
								if( BBupper <= 0.655697 )
									ret := 0.111111
								if( BBupper > 0.655697 )
									ret := -1.000000 // sell
						if( BBlower > 0.376303 )
							if( dif_source_BBlower <= 0.056787 )
								if( BBupper <= 1.8187 )
									ret := 0.624454
								if( BBupper > 1.8187 )
									ret := -0.060606
							if( dif_source_BBlower > 0.056787 )
								if( BBlower <= 1.43372 )
									ret := 0.264550
								if( BBlower > 1.43372 )
									ret := -1.000000 // sell
			if( dif_source_BBupper > -0.256591 )
				if( dif_source_BBlower <= -0.043326 )
					if( BBlower <= 0.536942 )
						if( BBlower <= 0.436836 )
							ret := 0.750000 // buy
						if( BBlower > 0.436836 )
							if( dif_source_BBupper <= -0.164811 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -0.164811 )
								ret := 0.750000 // buy
					if( BBlower > 0.536942 )
						if( dif_source_BBlower <= -0.078328 )
							if( vrsi <= 12.4543 )
								ret := 0.750000 // buy
							if( vrsi > 12.4543 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > -0.078328 )
							if( dif_source_BBupper <= -0.191414 )
								if( BBupper <= 1.65084 )
									ret := 0.944444 // buy
								if( BBupper > 1.65084 )
									ret := 0.250000
							if( dif_source_BBupper > -0.191414 )
								if( dif_source_BBlower <= -0.054793 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -0.054793 )
									ret := -0.125000
				if( dif_source_BBlower > -0.043326 )
					if( vrsi <= 3.26278 )
						if( BBlower <= 0.447633 )
							if( BBupper <= 0.617296 )
								ret := 0.571429
							if( BBupper > 0.617296 )
								ret := -1.000000 // sell
						if( BBlower > 0.447633 )
							if( BBupper <= 0.6761 )
								ret := 0.000000
							if( BBupper > 0.6761 )
								if( BBlower <= 1.38412 )
									ret := 0.760563 // buy
								if( BBlower > 1.38412 )
									ret := 0.000000
					if( vrsi > 3.26278 )
						if( BBupper <= 1.71698 )
							if( BBlower <= 0.351874 )
								if( dif_source_BBupper <= -0.194445 )
									ret := 0.844444 // buy
								if( dif_source_BBupper > -0.194445 )
									ret := 0.274809
							if( BBlower > 0.351874 )
								if( BBupper <= 0.639183 )
									ret := -0.051447
								if( BBupper > 0.639183 )
									ret := 0.135124
						if( BBupper > 1.71698 )
							if( dif_source_BBupper <= -0.228834 )
								ret := -1.000000 // sell
							if( dif_source_BBupper > -0.228834 )
								ret := -0.500000
		if( dif_source_BBlower > 0.11267 )
			if( BBlower <= 0.949896 )
				if( vrsi <= 59.2574 )
					if( BBupper <= 1.59913 )
						if( BBlower <= 0.533329 )
							if( BBlower <= 0.27432 )
								if( BBupper <= 0.612164 )
									ret := 0.275591
								if( BBupper > 0.612164 )
									ret := 1.000000 // buy
							if( BBlower > 0.27432 )
								if( dif_source_BBupper <= -0.213805 )
									ret := 0.487179
								if( dif_source_BBupper > -0.213805 )
									ret := -0.151261
						if( BBlower > 0.533329 )
							if( vrsi <= 4.03534 )
								if( dif_source_BBupper <= -0.213664 )
									ret := -0.500000
								if( dif_source_BBupper > -0.213664 )
									ret := -0.800000 // sell
							if( vrsi > 4.03534 )
								if( dif_source_BBupper <= -0.29074 )
									ret := 0.178082
								if( dif_source_BBupper > -0.29074 )
									ret := 0.633880
					if( BBupper > 1.59913 )
						if( dif_source_BBlower <= 0.149735 )
							ret := -1.000000 // sell
						if( dif_source_BBlower > 0.149735 )
							ret := -0.250000
				if( vrsi > 59.2574 )
					if( dif_source_BBlower <= 0.418386 )
						if( vrsi <= 64.1011 )
							if( BBupper <= 0.584057 )
								ret := 0.428571
							if( BBupper > 0.584057 )
								if( BBupper <= 1.04197 )
									ret := -0.782609 // sell
								if( BBupper > 1.04197 )
									ret := -0.259259
						if( vrsi > 64.1011 )
							if( BBupper <= 0.870421 )
								if( BBlower <= 0.388718 )
									ret := 0.025641
								if( BBlower > 0.388718 )
									ret := -0.470588
							if( BBupper > 0.870421 )
								if( BBupper <= 1.15292 )
									ret := 0.592593
								if( BBupper > 1.15292 )
									ret := 0.090164
					if( dif_source_BBlower > 0.418386 )
						if( BBupper <= 1.54231 )
							if( BBupper <= 1.14225 )
								ret := -1.000000 // sell
							if( BBupper > 1.14225 )
								if( dif_source_BBlower <= 0.535788 )
									ret := -0.857143 // sell
								if( dif_source_BBlower > 0.535788 )
									ret := -0.500000
						if( BBupper > 1.54231 )
							ret := 0.142857
			if( BBlower > 0.949896 )
				if( BBlower <= 1.03631 )
					if( vrsi <= 52.876 )
						if( dif_source_BBupper <= -0.366499 )
							if( dif_source_BBupper <= -0.602567 )
								if( BBupper <= 1.73011 )
									ret := -0.500000
								if( BBupper > 1.73011 )
									ret := 0.750000 // buy
							if( dif_source_BBupper > -0.602567 )
								if( dif_source_BBlower <= 0.174164 )
									ret := -0.821429 // sell
								if( dif_source_BBlower > 0.174164 )
									ret := 0.000000
						if( dif_source_BBupper > -0.366499 )
							if( BBlower <= 1.02161 )
								if( dif_source_BBupper <= -0.255311 )
									ret := 0.075000
								if( dif_source_BBupper > -0.255311 )
									ret := 0.600000
							if( BBlower > 1.02161 )
								if( vrsi <= 28.3181 )
									ret := 0.750000 // buy
								if( vrsi > 28.3181 )
									ret := -0.769231 // sell
					if( vrsi > 52.876 )
						if( BBupper <= 1.55964 )
							if( dif_source_BBupper <= -0.167047 )
								if( vrsi <= 61.2175 )
									ret := -0.187500
								if( vrsi > 61.2175 )
									ret := -0.647887
							if( dif_source_BBupper > -0.167047 )
								if( dif_source_BBupper <= -0.1597 )
									ret := 0.800000 // buy
								if( dif_source_BBupper > -0.1597 )
									ret := -0.277778
						if( BBupper > 1.55964 )
							if( dif_source_BBlower <= 0.160872 )
								ret := -0.800000 // sell
							if( dif_source_BBlower > 0.160872 )
								ret := -1.000000 // sell
				if( BBlower > 1.03631 )
					if( BBupper <= 1.7605 )
						if( BBupper <= 1.68606 )
							if( vrsi <= 7.09082 )
								if( vrsi <= 3.17962 )
									ret := 0.750000 // buy
								if( vrsi > 3.17962 )
									ret := 1.000000 // buy
							if( vrsi > 7.09082 )
								if( BBlower <= 1.23329 )
									ret := -0.318681
								if( BBlower > 1.23329 )
									ret := 0.052632
						if( BBupper > 1.68606 )
							if( BBlower <= 1.39824 )
								if( dif_source_BBlower <= 0.133217 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 0.133217 )
									ret := 0.371429
							if( BBlower > 1.39824 )
								if( BBupper <= 1.72436 )
									ret := -0.857143 // sell
								if( BBupper > 1.72436 )
									ret := -0.200000
					if( BBupper > 1.7605 )
						if( BBupper <= 1.89577 )
							if( dif_source_BBupper <= -0.249045 )
								if( dif_source_BBlower <= 0.136627 )
									ret := -0.080000
								if( dif_source_BBlower > 0.136627 )
									ret := -0.687500
							if( dif_source_BBupper > -0.249045 )
								if( BBlower <= 1.22783 )
									ret := 0.555556
								if( BBlower > 1.22783 )
									ret := -0.294118
						if( BBupper > 1.89577 )
							if( dif_source_BBupper <= -0.360613 )
								if( vrsi <= 74.628 )
									ret := 0.730769 // buy
								if( vrsi > 74.628 )
									ret := -0.600000
							if( dif_source_BBupper > -0.360613 )
								if( vrsi <= 17.1339 )
									ret := 1.000000 // buy
								if( vrsi > 17.1339 )
									ret := -0.306306
	if( dif_source_BBupper > -0.143128 )
		if( vrsi <= 19.652 )
			if( BBlower <= 0.22248 )
				if( dif_source_BBlower <= 0.178483 )
					if( dif_source_BBupper <= -0.015606 )
						if( dif_source_BBupper <= -0.088399 )
							ret := 0.666667
						if( dif_source_BBupper > -0.088399 )
							if( BBupper <= 0.244143 )
								ret := 0.666667
							if( BBupper > 0.244143 )
								if( vrsi <= 9.18592 )
									ret := 0.900000 // buy
								if( vrsi > 9.18592 )
									ret := 1.000000 // buy
					if( dif_source_BBupper > -0.015606 )
						if( vrsi <= 10.486 )
							ret := 0.250000
						if( vrsi > 10.486 )
							if( vrsi <= 10.9313 )
								ret := 1.000000 // buy
							if( vrsi > 10.9313 )
								if( dif_source_BBupper <= -0.01126 )
									ret := 0.750000 // buy
								if( dif_source_BBupper > -0.01126 )
									ret := 0.285714
				if( dif_source_BBlower > 0.178483 )
					ret := -0.500000
			if( BBlower > 0.22248 )
				if( dif_source_BBupper <= -0.022701 )
					if( BBlower <= 0.82095 )
						if( dif_source_BBlower <= 0.036044 )
							if( dif_source_BBlower <= -0.018707 )
								if( BBlower <= 0.81159 )
									ret := 0.523179
								if( BBlower > 0.81159 )
									ret := -0.750000 // sell
							if( dif_source_BBlower > -0.018707 )
								if( BBlower <= 0.586436 )
									ret := 0.212456
								if( BBlower > 0.586436 )
									ret := 0.030885
						if( dif_source_BBlower > 0.036044 )
							if( dif_source_BBlower <= 0.576871 )
								if( BBlower <= 0.248344 )
									ret := 0.909091 // buy
								if( BBlower > 0.248344 )
									ret := 0.320457
							if( dif_source_BBlower > 0.576871 )
								ret := -1.000000 // sell
					if( BBlower > 0.82095 )
						if( dif_source_BBlower <= 0.14072 )
							if( BBlower <= 0.970803 )
								if( dif_source_BBlower <= -0.015199 )
									ret := 0.416667
								if( dif_source_BBlower > -0.015199 )
									ret := -0.263538
							if( BBlower > 0.970803 )
								if( dif_source_BBlower <= 0.000173 )
									ret := -0.322034
								if( dif_source_BBlower > 0.000173 )
									ret := 0.138710
						if( dif_source_BBlower > 0.14072 )
							if( BBupper <= 1.43798 )
								if( BBlower <= 0.853026 )
									ret := 0.000000
								if( BBlower > 0.853026 )
									ret := 0.826087 // buy
							if( BBupper > 1.43798 )
								if( vrsi <= 18.3269 )
									ret := -0.342857
								if( vrsi > 18.3269 )
									ret := 0.857143 // buy
				if( dif_source_BBupper > -0.022701 )
					if( vrsi <= 16.547 )
						if( vrsi <= 11.0381 )
							if( dif_source_BBupper <= 0.017118 )
								if( vrsi <= 9.79326 )
									ret := 0.068478
								if( vrsi > 9.79326 )
									ret := 0.232558
							if( dif_source_BBupper > 0.017118 )
								ret := 1.000000 // buy
						if( vrsi > 11.0381 )
							if( BBupper <= 0.351752 )
								if( vrsi <= 12.7582 )
									ret := -0.368421
								if( vrsi > 12.7582 )
									ret := 0.354167
							if( BBupper > 0.351752 )
								if( vrsi <= 16.4395 )
									ret := -0.102564
								if( vrsi > 16.4395 )
									ret := -0.652174
					if( vrsi > 16.547 )
						if( dif_source_BBlower <= 0.01219 )
							if( vrsi <= 18.5216 )
								if( dif_source_BBupper <= -0.017398 )
									ret := -0.245614
								if( dif_source_BBupper > -0.017398 )
									ret := 0.035398
							if( vrsi > 18.5216 )
								if( BBlower <= 0.475695 )
									ret := 0.246377
								if( BBlower > 0.475695 )
									ret := -0.074074
						if( dif_source_BBlower > 0.01219 )
							if( BBupper <= 0.618588 )
								if( vrsi <= 16.8511 )
									ret := 0.731707 // buy
								if( vrsi > 16.8511 )
									ret := 0.297659
							if( BBupper > 0.618588 )
								if( dif_source_BBlower <= 0.190626 )
									ret := -0.116505
								if( dif_source_BBlower > 0.190626 )
									ret := 1.000000 // buy
		if( vrsi > 19.652 )
			if( BBlower <= 0.590305 )
				if( BBupper <= 0.354154 )
					if( vrsi <= 63.9566 )
						if( dif_source_BBlower <= 0.014379 )
							if( BBupper <= 0.352249 )
								if( BBlower <= 0.276849 )
									ret := 0.038908
								if( BBlower > 0.276849 )
									ret := 0.117378
							if( BBupper > 0.352249 )
								if( vrsi <= 32.3383 )
									ret := 0.111111
								if( vrsi > 32.3383 )
									ret := 0.446809
						if( dif_source_BBlower > 0.014379 )
							if( dif_source_BBupper <= 0.001805 )
								if( dif_source_BBlower <= 0.032154 )
									ret := 0.216110
								if( dif_source_BBlower > 0.032154 )
									ret := 0.030992
							if( dif_source_BBupper > 0.001805 )
								if( dif_source_BBlower <= 0.051701 )
									ret := 0.344595
								if( dif_source_BBlower > 0.051701 )
									ret := 0.682353
					if( vrsi > 63.9566 )
						if( dif_source_BBlower <= 0.017562 )
							if( dif_source_BBupper <= 0.001648 )
								if( BBupper <= 0.283867 )
									ret := 0.031593
								if( BBupper > 0.283867 )
									ret := 0.212375
							if( dif_source_BBupper > 0.001648 )
								if( vrsi <= 96.6165 )
									ret := -0.307692
								if( vrsi > 96.6165 )
									ret := -1.000000 // sell
						if( dif_source_BBlower > 0.017562 )
							if( vrsi <= 64.7419 )
								if( dif_source_BBupper <= 0.007537 )
									ret := -0.616667
								if( dif_source_BBupper > 0.007537 )
									ret := 0.200000
							if( vrsi > 64.7419 )
								if( vrsi <= 94.5251 )
									ret := 0.035043
								if( vrsi > 94.5251 )
									ret := -0.446809
				if( BBupper > 0.354154 )
					if( BBupper <= 0.659378 )
						if( BBupper <= 0.637222 )
							if( vrsi <= 78.7808 )
								if( BBupper <= 0.447302 )
									ret := 0.017675
								if( BBupper > 0.447302 )
									ret := 0.066672
							if( vrsi > 78.7808 )
								if( BBlower <= 0.434865 )
									ret := 0.032282
								if( BBlower > 0.434865 )
									ret := -0.089548
						if( BBupper > 0.637222 )
							if( dif_source_BBupper <= -0.02339 )
								if( vrsi <= 65.4999 )
									ret := 0.010260
								if( vrsi > 65.4999 )
									ret := -0.120240
							if( dif_source_BBupper > -0.02339 )
								if( vrsi <= 40.7926 )
									ret := 0.090909
								if( vrsi > 40.7926 )
									ret := -0.288571
					if( BBupper > 0.659378 )
						if( dif_source_BBlower <= 0.027477 )
							if( vrsi <= 90.7682 )
								if( dif_source_BBlower <= -0.004299 )
									ret := 0.000000
								if( dif_source_BBlower > -0.004299 )
									ret := 0.359848
							if( vrsi > 90.7682 )
								if( dif_source_BBlower <= 0.024158 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 0.024158 )
									ret := 0.600000
						if( dif_source_BBlower > 0.027477 )
							if( vrsi <= 35.3839 )
								if( BBupper <= 1.07892 )
									ret := 0.357143
								if( BBupper > 1.07892 )
									ret := -1.000000 // sell
							if( vrsi > 35.3839 )
								if( dif_source_BBlower <= 0.423063 )
									ret := 0.052664
								if( dif_source_BBlower > 0.423063 )
									ret := -0.322034
			if( BBlower > 0.590305 )
				if( dif_source_BBupper <= 0.020441 )
					if( vrsi <= 49.055 )
						if( dif_source_BBupper <= -0.067989 )
							if( BBlower <= 1.32737 )
								if( vrsi <= 23.4266 )
									ret := -0.075163
								if( vrsi > 23.4266 )
									ret := 0.162838
							if( BBlower > 1.32737 )
								if( vrsi <= 30.3812 )
									ret := 0.111111
								if( vrsi > 30.3812 )
									ret := -0.648649
						if( dif_source_BBupper > -0.067989 )
							if( dif_source_BBupper <= -0.001214 )
								if( BBlower <= 1.13086 )
									ret := -0.028582
								if( BBlower > 1.13086 )
									ret := -0.318182
							if( dif_source_BBupper > -0.001214 )
								if( vrsi <= 47.6839 )
									ret := 0.134529
								if( vrsi > 47.6839 )
									ret := 0.676471
					if( vrsi > 49.055 )
						if( BBlower <= 1.34975 )
							if( dif_source_BBlower <= 0.304651 )
								if( BBlower <= 1.07595 )
									ret := -0.044217
								if( BBlower > 1.07595 )
									ret := 0.046440
							if( dif_source_BBlower > 0.304651 )
								if( BBlower <= 0.775489 )
									ret := -0.466019
								if( BBlower > 0.775489 )
									ret := -0.094421
						if( BBlower > 1.34975 )
							if( vrsi <= 53.9301 )
								ret := -1.000000 // sell
							if( vrsi > 53.9301 )
								if( dif_source_BBupper <= -0.075676 )
									ret := -0.522727
								if( dif_source_BBupper > -0.075676 )
									ret := -0.062500
				if( dif_source_BBupper > 0.020441 )
					if( BBlower <= 0.974118 )
						if( BBupper <= 0.878465 )
							if( dif_source_BBlower <= 0.085661 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > 0.085661 )
								if( BBupper <= 0.666613 )
									ret := 0.833333 // buy
								if( BBupper > 0.666613 )
									ret := -0.505882
						if( BBupper > 0.878465 )
							if( dif_source_BBupper <= 0.119585 )
								if( vrsi <= 92.3343 )
									ret := 0.234146
								if( vrsi > 92.3343 )
									ret := -0.324324
							if( dif_source_BBupper > 0.119585 )
								if( vrsi <= 84.9049 )
									ret := 0.000000
								if( vrsi > 84.9049 )
									ret := -1.000000 // sell
					if( BBlower > 0.974118 )
						if( BBupper <= 1.11162 )
							ret := 0.333333
						if( BBupper > 1.11162 )
							if( dif_source_BBupper <= 0.036268 )
								if( BBupper <= 1.33533 )
									ret := -0.577778
								if( BBupper > 1.33533 )
									ret := -0.129032
							if( dif_source_BBupper > 0.036268 )
								if( BBupper <= 1.16488 )
									ret := -0.615385
								if( BBupper > 1.16488 )
									ret := -0.923077 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_XRPUSDT_30Min_17f6745f(BBupper, BBlower, crossover_rsi_bblowerInt, vrsi, dif_source_BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


