//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: META_1Min_1BOL_6409a614 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_1BOL_6409a614", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_6409a614(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 46.1284 )
		if( BBlower <= 463.132 )
			if( BBupper <= 461.972 )
				if( dif_source_BBupper <= -10.3258 )
					if( BBlower <= 414.509 )
						if( dif_source_BBlower <= 20.3923 )
							if( dif_source_BBupper <= -18.7918 )
								if( BBupper <= 439.291 )
									ret := 0.500000
								if( BBupper > 439.291 )
									ret := 0.833333 // buy
							if( dif_source_BBupper > -18.7918 )
								if( dif_source_BBlower <= 19.1881 )
									ret := 0.965909 // buy
								if( dif_source_BBlower > 19.1881 )
									ret := 0.800000 // buy
						if( dif_source_BBlower > 20.3923 )
							if( BBlower <= 408.188 )
								ret := 1.000000 // buy
							if( BBlower > 408.188 )
								ret := -0.800000 // sell
					if( BBlower > 414.509 )
						if( BBupper <= 434.434 )
							if( dif_source_BBupper <= -18.2593 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > -18.2593 )
								if( dif_source_BBupper <= -13.6932 )
									ret := -0.800000 // sell
								if( dif_source_BBupper > -13.6932 )
									ret := 0.031250
						if( BBupper > 434.434 )
							if( vrsi <= 19.7599 )
								if( dif_source_BBlower <= 5.22029 )
									ret := 0.862745 // buy
								if( dif_source_BBlower > 5.22029 )
									ret := 0.333333
							if( vrsi > 19.7599 )
								if( BBlower <= 436.443 )
									ret := 0.490909
								if( BBlower > 436.443 )
									ret := -0.212121
				if( dif_source_BBupper > -10.3258 )
					if( dif_source_BBlower <= 10.6486 )
						if( BBlower <= 423.334 )
							if( dif_source_BBupper <= -4.53013 )
								if( BBlower <= 413.562 )
									ret := 0.400000
								if( BBlower > 413.562 )
									ret := -0.806452 // sell
							if( dif_source_BBupper > -4.53013 )
								ret := 1.000000 // buy
						if( BBlower > 423.334 )
							if( BBlower <= 425.183 )
								if( dif_source_BBupper <= -4.04896 )
									ret := 0.142857
								if( dif_source_BBupper > -4.04896 )
									ret := 0.923077 // buy
							if( BBlower > 425.183 )
								if( BBupper <= 446.799 )
									ret := 0.167939
								if( BBupper > 446.799 )
									ret := -0.061947
					if( dif_source_BBlower > 10.6486 )
						if( BBlower <= 412.445 )
							if( dif_source_BBlower <= 23.4989 )
								if( dif_source_BBupper <= 0.332038 )
									ret := 0.643564
								if( dif_source_BBupper > 0.332038 )
									ret := -1.000000 // sell
							if( dif_source_BBlower > 23.4989 )
								if( BBlower <= 407.916 )
									ret := -0.882353 // sell
								if( BBlower > 407.916 )
									ret := 0.100000
						if( BBlower > 412.445 )
							if( vrsi <= 5.03162 )
								if( vrsi <= 3.31501 )
									ret := 1.000000 // buy
								if( vrsi > 3.31501 )
									ret := 0.666667
							if( vrsi > 5.03162 )
								if( BBlower <= 436.805 )
									ret := -0.607143
								if( BBlower > 436.805 )
									ret := 0.137931
			if( BBupper > 461.972 )
				if( vrsi <= 34.7015 )
					if( dif_source_BBlower <= -0.494749 )
						if( BBupper <= 516.118 )
							if( dif_source_BBupper <= -4.32218 )
								if( dif_source_BBupper <= -22.2459 )
									ret := -0.054054
								if( dif_source_BBupper > -22.2459 )
									ret := -0.455782
							if( dif_source_BBupper > -4.32218 )
								ret := 0.857143 // buy
						if( BBupper > 516.118 )
							if( BBupper <= 520.44 )
								ret := 1.000000 // buy
							if( BBupper > 520.44 )
								if( BBlower <= 420.105 )
									ret := 1.000000 // buy
								if( BBlower > 420.105 )
									ret := -0.600000
					if( dif_source_BBlower > -0.494749 )
						if( dif_source_BBupper <= -24.5493 )
							if( BBupper <= 525.173 )
								if( vrsi <= 2.01679 )
									ret := -0.944444 // sell
								if( vrsi > 2.01679 )
									ret := 0.358491
							if( BBupper > 525.173 )
								if( dif_source_BBupper <= -113.148 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -113.148 )
									ret := -1.000000 // sell
						if( dif_source_BBupper > -24.5493 )
							if( BBupper <= 492.7 )
								if( vrsi <= 7.95984 )
									ret := 0.693122
								if( vrsi > 7.95984 )
									ret := 0.410788
							if( BBupper > 492.7 )
								if( dif_source_BBlower <= 38.884 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 38.884 )
									ret := 0.750000 // buy
				if( vrsi > 34.7015 )
					if( BBupper <= 494.108 )
						if( BBupper <= 488.659 )
							if( dif_source_BBlower <= 13.5745 )
								if( dif_source_BBlower <= -1.02272 )
									ret := -0.609756
								if( dif_source_BBlower > -1.02272 )
									ret := 0.081115
							if( dif_source_BBlower > 13.5745 )
								if( BBlower <= 446.617 )
									ret := 0.290909
								if( BBlower > 446.617 )
									ret := 0.925000 // buy
						if( BBupper > 488.659 )
							if( vrsi <= 42.325 )
								ret := -1.000000 // sell
							if( vrsi > 42.325 )
								ret := -0.500000
					if( BBupper > 494.108 )
						if( BBlower <= 459.988 )
							if( dif_source_BBlower <= 25.3171 )
								if( dif_source_BBlower <= 20.1927 )
									ret := 0.393939
								if( dif_source_BBlower > 20.1927 )
									ret := -0.900000 // sell
							if( dif_source_BBlower > 25.3171 )
								if( dif_source_BBupper <= -78.3795 )
									ret := 0.875000 // buy
								if( dif_source_BBupper > -78.3795 )
									ret := 0.500000
						if( BBlower > 459.988 )
							if( dif_source_BBlower <= -0.568045 )
								ret := 0.500000
							if( dif_source_BBlower > -0.568045 )
								ret := 1.000000 // buy
		if( BBlower > 463.132 )
			if( dif_source_BBupper <= -2.61247 )
				if( BBlower <= 464.259 )
					if( BBupper <= 468.595 )
						if( dif_source_BBlower <= 0.036235 )
							if( BBupper <= 465.974 )
								ret := 0.750000 // buy
							if( BBupper > 465.974 )
								ret := 1.000000 // buy
						if( dif_source_BBlower > 0.036235 )
							ret := 0.500000
					if( BBupper > 468.595 )
						if( dif_source_BBlower <= 1.51539 )
							if( dif_source_BBupper <= -10.4154 )
								if( vrsi <= 42.7913 )
									ret := -0.942308 // sell
								if( vrsi > 42.7913 )
									ret := -0.500000
							if( dif_source_BBupper > -10.4154 )
								if( BBlower <= 463.459 )
									ret := 0.076923
								if( BBlower > 463.459 )
									ret := -0.414894
						if( dif_source_BBlower > 1.51539 )
							if( dif_source_BBlower <= 12.4042 )
								if( vrsi <= 38.43 )
									ret := -0.278107
								if( vrsi > 38.43 )
									ret := 0.203704
							if( dif_source_BBlower > 12.4042 )
								if( BBlower <= 463.433 )
									ret := 0.250000
								if( BBlower > 463.433 )
									ret := 0.888889 // buy
				if( BBlower > 464.259 )
					if( dif_source_BBlower <= 0.756865 )
						if( dif_source_BBupper <= -20.1774 )
							if( dif_source_BBupper <= -36.3061 )
								if( dif_source_BBlower <= -26.6233 )
									ret := 0.545455
								if( dif_source_BBlower > -26.6233 )
									ret := -0.533333
							if( dif_source_BBupper > -36.3061 )
								if( dif_source_BBlower <= -0.024981 )
									ret := 0.664557
								if( dif_source_BBlower > -0.024981 )
									ret := 0.260870
						if( dif_source_BBupper > -20.1774 )
							if( vrsi <= 28.2033 )
								if( BBlower <= 471.743 )
									ret := 0.328431
								if( BBlower > 471.743 )
									ret := 0.181952
							if( vrsi > 28.2033 )
								if( BBlower <= 587.561 )
									ret := 0.090104
								if( BBlower > 587.561 )
									ret := -0.333333
					if( dif_source_BBlower > 0.756865 )
						if( dif_source_BBupper <= -17.873 )
							if( BBlower <= 478.468 )
								if( BBlower <= 474.81 )
									ret := 1.000000 // buy
								if( BBlower > 474.81 )
									ret := 0.571429
							if( BBlower > 478.468 )
								if( dif_source_BBupper <= -23.0176 )
									ret := 0.023121
								if( dif_source_BBupper > -23.0176 )
									ret := -0.353160
						if( dif_source_BBupper > -17.873 )
							if( BBlower <= 566.596 )
								if( BBlower <= 565.743 )
									ret := 0.067566
								if( BBlower > 565.743 )
									ret := -0.545455
							if( BBlower > 566.596 )
								if( BBupper <= 594.686 )
									ret := 0.274510
								if( BBupper > 594.686 )
									ret := -0.028369
			if( dif_source_BBupper > -2.61247 )
				if( BBlower <= 589.53 )
					if( dif_source_BBlower <= 20.829 )
						if( BBupper <= 485.245 )
							if( dif_source_BBlower <= 9.93414 )
								if( dif_source_BBupper <= -0.208719 )
									ret := -0.041667
								if( dif_source_BBupper > -0.208719 )
									ret := 0.284916
							if( dif_source_BBlower > 9.93414 )
								if( BBupper <= 475.187 )
									ret := -0.100000
								if( BBupper > 475.187 )
									ret := -0.770492 // sell
						if( BBupper > 485.245 )
							if( BBlower <= 474.394 )
								if( BBlower <= 472.868 )
									ret := -1.000000 // sell
								if( BBlower > 472.868 )
									ret := 0.641026
							if( BBlower > 474.394 )
								if( BBupper <= 511.203 )
									ret := 0.087887
								if( BBupper > 511.203 )
									ret := 0.027685
					if( dif_source_BBlower > 20.829 )
						if( dif_source_BBlower <= 24.5794 )
							if( BBlower <= 503.102 )
								if( dif_source_BBupper <= 1.62812 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > 1.62812 )
									ret := 0.500000
							if( BBlower > 503.102 )
								if( dif_source_BBlower <= 22.6301 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 22.6301 )
									ret := 0.250000
						if( dif_source_BBlower > 24.5794 )
							if( vrsi <= 28.8289 )
								ret := 1.000000 // buy
							if( vrsi > 28.8289 )
								if( dif_source_BBupper <= 0.728492 )
									ret := -1.000000 // sell
								if( dif_source_BBupper > 0.728492 )
									ret := -0.250000
				if( BBlower > 589.53 )
					if( vrsi <= 20.3173 )
						if( BBupper <= 598.028 )
							ret := 0.000000
						if( BBupper > 598.028 )
							ret := 0.800000 // buy
					if( vrsi > 20.3173 )
						if( dif_source_BBlower <= 2.28593 )
							if( BBupper <= 596.746 )
								ret := 0.250000
							if( BBupper > 596.746 )
								ret := 0.000000
						if( dif_source_BBlower > 2.28593 )
							if( vrsi <= 36.7346 )
								if( BBlower <= 590.856 )
									ret := -0.142857
								if( BBlower > 590.856 )
									ret := -0.833333 // sell
							if( vrsi > 36.7346 )
								if( vrsi <= 38.3261 )
									ret := -0.900000 // sell
								if( vrsi > 38.3261 )
									ret := -1.000000 // sell
	if( vrsi > 46.1284 )
		if( BBlower <= 464.873 )
			if( BBlower <= 451.596 )
				if( BBupper <= 443.283 )
					if( dif_source_BBlower <= 22.6811 )
						if( BBlower <= 409.488 )
							if( vrsi <= 84.6483 )
								if( vrsi <= 82.1004 )
									ret := 0.597826
								if( vrsi > 82.1004 )
									ret := -0.500000
							if( vrsi > 84.6483 )
								if( BBlower <= 404.262 )
									ret := 0.900000 // buy
								if( BBlower > 404.262 )
									ret := 1.000000 // buy
						if( BBlower > 409.488 )
							if( dif_source_BBupper <= 1.75357 )
								if( dif_source_BBupper <= -1.59343 )
									ret := 0.091162
								if( dif_source_BBupper > -1.59343 )
									ret := 0.361210
							if( dif_source_BBupper > 1.75357 )
								if( dif_source_BBlower <= 17.0754 )
									ret := -0.555556
								if( dif_source_BBlower > 17.0754 )
									ret := 1.000000 // buy
					if( dif_source_BBlower > 22.6811 )
						if( BBlower <= 410.506 )
							if( vrsi <= 67.4231 )
								if( BBupper <= 434.603 )
									ret := 0.857143 // buy
								if( BBupper > 434.603 )
									ret := -0.500000
							if( vrsi > 67.4231 )
								if( vrsi <= 84.5146 )
									ret := -0.931818 // sell
								if( vrsi > 84.5146 )
									ret := 0.083333
						if( BBlower > 410.506 )
							if( dif_source_BBupper <= 6.46586 )
								ret := 1.000000 // buy
							if( dif_source_BBupper > 6.46586 )
								ret := 0.750000 // buy
				if( BBupper > 443.283 )
					if( dif_source_BBupper <= -3.23805 )
						if( BBupper <= 517.598 )
							if( BBupper <= 450.442 )
								if( dif_source_BBlower <= 9.28455 )
									ret := 0.008562
								if( dif_source_BBlower > 9.28455 )
									ret := -0.884615 // sell
							if( BBupper > 450.442 )
								if( dif_source_BBupper <= -25.9987 )
									ret := 0.030120
								if( dif_source_BBupper > -25.9987 )
									ret := 0.285714
						if( BBupper > 517.598 )
							if( dif_source_BBlower <= 9.04224 )
								if( dif_source_BBlower <= -9.96644 )
									ret := -1.000000 // sell
								if( dif_source_BBlower > -9.96644 )
									ret := 0.727273 // buy
							if( dif_source_BBlower > 9.04224 )
								if( vrsi <= 51.4866 )
									ret := 0.454545
								if( vrsi > 51.4866 )
									ret := -0.896552 // sell
					if( dif_source_BBupper > -3.23805 )
						if( BBupper <= 453.633 )
							if( vrsi <= 98.3146 )
								if( dif_source_BBlower <= 17.0508 )
									ret := -0.072832
								if( dif_source_BBlower > 17.0508 )
									ret := -1.000000 // sell
							if( vrsi > 98.3146 )
								if( BBlower <= 436.638 )
									ret := -0.900000 // sell
								if( BBlower > 436.638 )
									ret := -0.432432
						if( BBupper > 453.633 )
							if( BBupper <= 455.799 )
								if( BBlower <= 449.988 )
									ret := -0.847222 // sell
								if( BBlower > 449.988 )
									ret := 0.000000
							if( BBupper > 455.799 )
								if( vrsi <= 93.3514 )
									ret := -0.276596
								if( vrsi > 93.3514 )
									ret := -0.821429 // sell
			if( BBlower > 451.596 )
				if( dif_source_BBlower <= 9.31022 )
					if( BBupper <= 465.213 )
						if( vrsi <= 88.6513 )
							if( dif_source_BBlower <= 4.15297 )
								if( BBlower <= 455.498 )
									ret := 0.604317
								if( BBlower > 455.498 )
									ret := 0.217949
							if( dif_source_BBlower > 4.15297 )
								if( BBlower <= 457.561 )
									ret := 0.090278
								if( BBlower > 457.561 )
									ret := 0.600000
						if( vrsi > 88.6513 )
							if( dif_source_BBupper <= -2.97565 )
								ret := -0.285714
							if( dif_source_BBupper > -2.97565 )
								if( BBlower <= 456.803 )
									ret := 0.492537
								if( BBlower > 456.803 )
									ret := 0.797101 // buy
					if( BBupper > 465.213 )
						if( dif_source_BBupper <= -8.18873 )
							if( BBupper <= 470.559 )
								if( dif_source_BBupper <= -13.172 )
									ret := -0.307692
								if( dif_source_BBupper > -13.172 )
									ret := 0.563636
							if( BBupper > 470.559 )
								if( vrsi <= 87.3694 )
									ret := -0.134426
								if( vrsi > 87.3694 )
									ret := -0.878788 // sell
						if( dif_source_BBupper > -8.18873 )
							if( dif_source_BBupper <= -5.99314 )
								if( vrsi <= 56.336 )
									ret := 0.584746
								if( vrsi > 56.336 )
									ret := 0.187500
							if( dif_source_BBupper > -5.99314 )
								if( vrsi <= 51.5342 )
									ret := -0.079602
								if( vrsi > 51.5342 )
									ret := 0.166929
				if( dif_source_BBlower > 9.31022 )
					if( vrsi <= 89.743 )
						if( vrsi <= 54.9503 )
							if( BBlower <= 456.245 )
								if( BBupper <= 466.392 )
									ret := 0.500000
								if( BBupper > 466.392 )
									ret := -0.315789
							if( BBlower > 456.245 )
								if( BBupper <= 497.743 )
									ret := 0.311475
								if( BBupper > 497.743 )
									ret := 0.968750 // buy
						if( vrsi > 54.9503 )
							if( dif_source_BBupper <= 2.90769 )
								if( dif_source_BBupper <= -7.60641 )
									ret := 0.692308
								if( dif_source_BBupper > -7.60641 )
									ret := 0.018622
							if( dif_source_BBupper > 2.90769 )
								if( BBupper <= 477.664 )
									ret := -0.555556
								if( BBupper > 477.664 )
									ret := -1.000000 // sell
					if( vrsi > 89.743 )
						if( dif_source_BBupper <= 2.12798 )
							if( BBlower <= 464.041 )
								if( BBlower <= 456.853 )
									ret := -0.363636
								if( BBlower > 456.853 )
									ret := -0.761905 // sell
							if( BBlower > 464.041 )
								if( dif_source_BBlower <= 10.0055 )
									ret := -1.000000 // sell
								if( dif_source_BBlower > 10.0055 )
									ret := 0.250000
						if( dif_source_BBupper > 2.12798 )
							if( dif_source_BBupper <= 2.8988 )
								ret := 0.285714
							if( dif_source_BBupper > 2.8988 )
								if( vrsi <= 93.5093 )
									ret := -1.000000 // sell
								if( vrsi > 93.5093 )
									ret := -0.200000
		if( BBlower > 464.873 )
			if( dif_source_BBupper <= -17.5545 )
				if( dif_source_BBlower <= 5.81862 )
					if( dif_source_BBlower <= 1.48585 )
						if( BBlower <= 471.832 )
							if( vrsi <= 49.578 )
								ret := -0.500000
							if( vrsi > 49.578 )
								ret := -1.000000 // sell
						if( BBlower > 471.832 )
							if( dif_source_BBlower <= -0.979087 )
								if( BBlower <= 476.858 )
									ret := -0.687500
								if( BBlower > 476.858 )
									ret := 0.705882 // buy
							if( dif_source_BBlower > -0.979087 )
								if( crossover_rsi_bblowerInt <= 0.5 )
									ret := -0.683168
								if( crossover_rsi_bblowerInt > 0.5 )
									ret := 0.142857
					if( dif_source_BBlower > 1.48585 )
						if( BBupper <= 511.746 )
							if( vrsi <= 68.4404 )
								if( BBupper <= 509.033 )
									ret := -0.232143
								if( BBupper > 509.033 )
									ret := 0.750000 // buy
							if( vrsi > 68.4404 )
								if( BBupper <= 494.873 )
									ret := 0.000000
								if( BBupper > 494.873 )
									ret := 0.818182 // buy
						if( BBupper > 511.746 )
							if( BBlower <= 508.863 )
								if( dif_source_BBupper <= -23.4987 )
									ret := 0.294118
								if( dif_source_BBupper > -23.4987 )
									ret := -0.698413
							if( BBlower > 508.863 )
								if( BBupper <= 539.715 )
									ret := 0.769231 // buy
								if( BBupper > 539.715 )
									ret := 0.020408
				if( dif_source_BBlower > 5.81862 )
					if( BBupper <= 526.673 )
						if( BBupper <= 511.131 )
							if( dif_source_BBupper <= -21.6308 )
								if( BBlower <= 481.615 )
									ret := -0.333333
								if( BBlower > 481.615 )
									ret := 0.600000
							if( dif_source_BBupper > -21.6308 )
								if( BBupper <= 508.085 )
									ret := -0.625000
								if( BBupper > 508.085 )
									ret := -0.944444 // sell
						if( BBupper > 511.131 )
							if( dif_source_BBlower <= 6.47773 )
								if( dif_source_BBlower <= 6.41791 )
									ret := -1.000000 // sell
								if( dif_source_BBlower > 6.41791 )
									ret := -0.500000
							if( dif_source_BBlower > 6.47773 )
								ret := -1.000000 // sell
					if( BBupper > 526.673 )
						if( BBlower <= 498.789 )
							if( dif_source_BBupper <= -20.6966 )
								ret := 0.833333 // buy
							if( dif_source_BBupper > -20.6966 )
								ret := -0.333333
						if( BBlower > 498.789 )
							if( BBlower <= 508.709 )
								ret := -1.000000 // sell
							if( BBlower > 508.709 )
								if( dif_source_BBupper <= -21.3175 )
									ret := -0.428571
								if( dif_source_BBupper > -21.3175 )
									ret := 0.000000
			if( dif_source_BBupper > -17.5545 )
				if( BBupper <= 469.94 )
					if( vrsi <= 64.4486 )
						if( dif_source_BBupper <= -3.31043 )
							if( dif_source_BBlower <= -0.160063 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > -0.160063 )
								ret := -0.571429
						if( dif_source_BBupper > -3.31043 )
							if( dif_source_BBupper <= -3.02011 )
								if( BBlower <= 465.964 )
									ret := 0.500000
								if( BBlower > 465.964 )
									ret := 1.000000 // buy
							if( dif_source_BBupper > -3.02011 )
								if( BBlower <= 465.656 )
									ret := -0.520000
								if( BBlower > 465.656 )
									ret := -0.056180
					if( vrsi > 64.4486 )
						if( dif_source_BBlower <= 2.76818 )
							if( dif_source_BBupper <= -0.843048 )
								if( BBupper <= 468.948 )
									ret := -0.187500
								if( BBupper > 468.948 )
									ret := -0.594937
							if( dif_source_BBupper > -0.843048 )
								ret := 0.000000
						if( dif_source_BBlower > 2.76818 )
							if( vrsi <= 82.052 )
								if( BBlower <= 465.43 )
									ret := 0.000000
								if( BBlower > 465.43 )
									ret := -0.500000
							if( vrsi > 82.052 )
								if( BBlower <= 466.137 )
									ret := -1.000000 // sell
								if( BBlower > 466.137 )
									ret := -0.750000 // sell
				if( BBupper > 469.94 )
					if( dif_source_BBlower <= 1.41244 )
						if( BBlower <= 518.332 )
							if( BBupper <= 520.998 )
								if( dif_source_BBupper <= -1.83737 )
									ret := 0.109352
								if( dif_source_BBupper > -1.83737 )
									ret := -0.060665
							if( BBupper > 520.998 )
								if( BBlower <= 509.021 )
									ret := -0.428571
								if( BBlower > 509.021 )
									ret := 0.558935
						if( BBlower > 518.332 )
							if( vrsi <= 91.4682 )
								if( dif_source_BBupper <= -0.574027 )
									ret := -0.030785
								if( dif_source_BBupper > -0.574027 )
									ret := -0.809524 // sell
							if( vrsi > 91.4682 )
								if( vrsi <= 94.475 )
									ret := 0.513514
								if( vrsi > 94.475 )
									ret := 0.137931
					if( dif_source_BBlower > 1.41244 )
						if( dif_source_BBupper <= 1.14849 )
							if( dif_source_BBupper <= -14.9837 )
								if( BBlower <= 493.076 )
									ret := 0.638889
								if( BBlower > 493.076 )
									ret := -0.019048
							if( dif_source_BBupper > -14.9837 )
								if( BBlower <= 471.653 )
									ret := -0.085010
								if( BBlower > 471.653 )
									ret := 0.008080
						if( dif_source_BBupper > 1.14849 )
							if( dif_source_BBlower <= 9.46367 )
								if( BBlower <= 471.144 )
									ret := -0.718750 // sell
								if( BBlower > 471.144 )
									ret := 0.034384
							if( dif_source_BBlower > 9.46367 )
								if( dif_source_BBlower <= 21.4035 )
									ret := -0.244415
								if( dif_source_BBlower > 21.4035 )
									ret := -0.894737 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_META_1Min_6409a614(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


