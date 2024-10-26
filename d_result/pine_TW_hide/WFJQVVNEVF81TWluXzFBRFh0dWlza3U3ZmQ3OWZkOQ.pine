//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: XRPUSDT_5Min_1ADX_7fd79fd9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_5Min_1ADX_7fd79fd9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_5Min_7fd79fd9(trueRange, diPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, adx, smoothedDirectionalMovementMinus, dx, directionalMovementPlus, directionalMovementMinus, diMinus)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( diPlus <= 10.7009 )
		if( directionalMovementMinus <= 0.001128 )
			if( smoothedTrueRange <= 0.001444 )
				if( dx <= 91.3023 )
					if( smoothedDirectionalMovementPlus <= 0.000115 )
						if( adx <= 29.0559 )
							if( diPlus <= 4.37157 )
								if( dx <= 80.4555 )
									ret := 0.880000 // buy
								if( dx > 80.4555 )
									ret := -0.285714
							if( diPlus > 4.37157 )
								if( smoothedDirectionalMovementMinus <= 0.00054 )
									ret := 0.001059
								if( smoothedDirectionalMovementMinus > 0.00054 )
									ret := -0.600000
						if( adx > 29.0559 )
							if( dx <= 63.3797 )
								if( smoothedTrueRange <= 0.000644 )
									ret := -0.002674
								if( smoothedTrueRange > 0.000644 )
									ret := -0.151869
							if( dx > 63.3797 )
								if( directionalMovementMinus <= 0.000203 )
									ret := -0.082903
								if( directionalMovementMinus > 0.000203 )
									ret := 0.037714
					if( smoothedDirectionalMovementPlus > 0.000115 )
						if( dx <= 63.7432 )
							if( smoothedDirectionalMovementMinus <= 0.000543 )
								if( directionalMovementMinus <= 5.3e-05 )
									ret := -0.089912
								if( directionalMovementMinus > 5.3e-05 )
									ret := 0.197740
							if( smoothedDirectionalMovementMinus > 0.000543 )
								if( directionalMovementPlus <= 8.7e-05 )
									ret := 0.781250 // buy
								if( directionalMovementPlus > 8.7e-05 )
									ret := 0.000000
						if( dx > 63.7432 )
							if( trueRange <= 0.00132 )
								if( directionalMovementPlus <= 2e-05 )
									ret := 0.285714
								if( directionalMovementPlus > 2e-05 )
									ret := -0.550000
							if( trueRange > 0.00132 )
								if( directionalMovementMinus <= 0.00035 )
									ret := -0.250000
								if( directionalMovementMinus > 0.00035 )
									ret := -0.750000 // sell
				if( dx > 91.3023 )
					if( smoothedTrueRange <= 0.000881 )
						if( diPlus <= 1.70216 )
							if( dx <= 96.24 )
								if( dx <= 94.8043 )
									ret := 0.000000
								if( dx > 94.8043 )
									ret := -0.916667 // sell
							if( dx > 96.24 )
								if( smoothedTrueRange <= 0.000751 )
									ret := 0.150000
								if( smoothedTrueRange > 0.000751 )
									ret := -0.117647
						if( diPlus > 1.70216 )
							ret := 0.578947
					if( smoothedTrueRange > 0.000881 )
						if( diMinus <= 43.401 )
							if( smoothedTrueRange <= 0.00134 )
								if( adx <= 57.4468 )
									ret := 0.520000
								if( adx > 57.4468 )
									ret := 0.811321 // buy
							if( smoothedTrueRange > 0.00134 )
								if( trueRange <= 0.00135 )
									ret := 0.200000
								if( trueRange > 0.00135 )
									ret := -0.285714
						if( diMinus > 43.401 )
							if( directionalMovementMinus <= 2.3e-05 )
								if( smoothedTrueRange <= 0.001261 )
									ret := 0.130435
								if( smoothedTrueRange > 0.001261 )
									ret := -0.833333 // sell
							if( directionalMovementMinus > 2.3e-05 )
								if( diPlus <= 1.05337 )
									ret := 0.785714 // buy
								if( diPlus > 1.05337 )
									ret := 0.151515
			if( smoothedTrueRange > 0.001444 )
				if( dx <= 53.4104 )
					if( diMinus <= 30.1119 )
						if( smoothedDirectionalMovementPlus <= 0.000208 )
							if( diPlus <= 9.42267 )
								if( diPlus <= 9.08369 )
									ret := 0.086957
								if( diPlus > 9.08369 )
									ret := -0.420765
							if( diPlus > 9.42267 )
								if( diPlus <= 10.6483 )
									ret := 0.142857
								if( diPlus > 10.6483 )
									ret := 0.640000
						if( smoothedDirectionalMovementPlus > 0.000208 )
							if( dx <= 35.2124 )
								if( dx <= 26.6867 )
									ret := 0.344262
								if( dx > 26.6867 )
									ret := -0.109091
							if( dx > 35.2124 )
								if( smoothedTrueRange <= 0.002478 )
									ret := 0.183544
								if( smoothedTrueRange > 0.002478 )
									ret := 0.472851
					if( diMinus > 30.1119 )
						if( directionalMovementPlus <= 0.000596 )
							if( adx <= 28.1809 )
								if( trueRange <= 0.001514 )
									ret := 0.500000
								if( trueRange > 0.001514 )
									ret := -0.181818
							if( adx > 28.1809 )
								if( smoothedTrueRange <= 0.003186 )
									ret := 0.637097
								if( smoothedTrueRange > 0.003186 )
									ret := 0.142857
						if( directionalMovementPlus > 0.000596 )
							if( diMinus <= 33.2133 )
								if( smoothedDirectionalMovementMinus <= 0.000713 )
									ret := 0.125000
								if( smoothedDirectionalMovementMinus > 0.000713 )
									ret := 0.630435
							if( diMinus > 33.2133 )
								ret := -0.454545
				if( dx > 53.4104 )
					if( adx <= 73.147 )
						if( smoothedDirectionalMovementMinus <= 0.000998 )
							if( smoothedDirectionalMovementMinus <= 0.000774 )
								if( trueRange <= 0.001018 )
									ret := -0.087591
								if( trueRange > 0.001018 )
									ret := 0.096736
							if( smoothedDirectionalMovementMinus > 0.000774 )
								if( directionalMovementPlus <= 0.001141 )
									ret := -0.103627
								if( directionalMovementPlus > 0.001141 )
									ret := 0.280488
						if( smoothedDirectionalMovementMinus > 0.000998 )
							if( directionalMovementMinus <= 4.7e-05 )
								if( trueRange <= 0.01238 )
									ret := 0.026549
								if( trueRange > 0.01238 )
									ret := 1.000000 // buy
							if( directionalMovementMinus > 4.7e-05 )
								if( diPlus <= 5.87697 )
									ret := 0.424191
								if( diPlus > 5.87697 )
									ret := 0.123016
					if( adx > 73.147 )
						if( smoothedTrueRange <= 0.002748 )
							if( diPlus <= 4.71848 )
								if( diPlus <= 0.883384 )
									ret := -0.266667
								if( diPlus > 0.883384 )
									ret := 0.604478
							if( diPlus > 4.71848 )
								if( smoothedDirectionalMovementMinus <= 0.000933 )
									ret := -0.207843
								if( smoothedDirectionalMovementMinus > 0.000933 )
									ret := 0.153846
						if( smoothedTrueRange > 0.002748 )
							if( trueRange <= 0.002237 )
								if( dx <= 71.3688 )
									ret := 0.277372
								if( dx > 71.3688 )
									ret := 0.716667 // buy
							if( trueRange > 0.002237 )
								if( diPlus <= 9.83912 )
									ret := 0.293307
								if( diPlus > 9.83912 )
									ret := -0.348837
		if( directionalMovementMinus > 0.001128 )
			if( trueRange <= 0.00562 )
				if( diPlus <= 4.11877 )
					if( diPlus <= 2.28126 )
						if( smoothedDirectionalMovementPlus <= 5.5e-05 )
							if( diMinus <= 31.3718 )
								ret := 1.000000 // buy
							if( diMinus > 31.3718 )
								if( adx <= 59.6115 )
									ret := -0.276596
								if( adx > 59.6115 )
									ret := 0.800000 // buy
						if( smoothedDirectionalMovementPlus > 5.5e-05 )
							if( dx <= 91.6119 )
								if( dx <= 90.9154 )
									ret := -0.928571 // sell
								if( dx > 90.9154 )
									ret := -0.500000
							if( dx > 91.6119 )
								ret := 0.352941
					if( diPlus > 2.28126 )
						if( trueRange <= 0.002508 )
							if( smoothedDirectionalMovementMinus <= 0.000377 )
								if( diPlus <= 3.05631 )
									ret := -0.800000 // sell
								if( diPlus > 3.05631 )
									ret := -0.363636
							if( smoothedDirectionalMovementMinus > 0.000377 )
								if( smoothedDirectionalMovementMinus <= 0.000678 )
									ret := 0.553571
								if( smoothedDirectionalMovementMinus > 0.000678 )
									ret := -0.098765
						if( trueRange > 0.002508 )
							if( smoothedTrueRange <= 0.002085 )
								if( smoothedDirectionalMovementMinus <= 0.000945 )
									ret := 0.301724
								if( smoothedDirectionalMovementMinus > 0.000945 )
									ret := 0.741935 // buy
							if( smoothedTrueRange > 0.002085 )
								if( dx <= 84.0263 )
									ret := 0.588235
								if( dx > 84.0263 )
									ret := 0.845745 // buy
				if( diPlus > 4.11877 )
					if( smoothedTrueRange <= 0.002202 )
						if( diMinus <= 30.2561 )
							if( diPlus <= 10.0209 )
								if( diPlus <= 6.7169 )
									ret := 0.259259
								if( diPlus > 6.7169 )
									ret := -0.437500
							if( diPlus > 10.0209 )
								if( trueRange <= 0.002043 )
									ret := 0.785714 // buy
								if( trueRange > 0.002043 )
									ret := 0.033333
						if( diMinus > 30.2561 )
							if( smoothedDirectionalMovementPlus <= 9.1e-05 )
								if( smoothedTrueRange <= 0.001696 )
									ret := 0.168971
								if( smoothedTrueRange > 0.001696 )
									ret := -0.339286
							if( smoothedDirectionalMovementPlus > 9.1e-05 )
								if( directionalMovementPlus <= 0 )
									ret := 0.327004
								if( directionalMovementPlus > 0 )
									ret := 0.048649
					if( smoothedTrueRange > 0.002202 )
						if( smoothedTrueRange <= 0.004854 )
							if( directionalMovementMinus <= 0.003643 )
								if( directionalMovementMinus <= 0.001855 )
									ret := 0.097101
								if( directionalMovementMinus > 0.001855 )
									ret := -0.103064
							if( directionalMovementMinus > 0.003643 )
								if( dx <= 67.9842 )
									ret := 0.062500
								if( dx > 67.9842 )
									ret := 0.606061
						if( smoothedTrueRange > 0.004854 )
							if( diMinus <= 36.9094 )
								if( adx <= 54.0614 )
									ret := 0.000000
								if( adx > 54.0614 )
									ret := 1.000000 // buy
							if( diMinus > 36.9094 )
								if( adx <= 67.6045 )
									ret := -0.835616 // sell
								if( adx > 67.6045 )
									ret := 0.044444
			if( trueRange > 0.00562 )
				if( dx <= 68.7883 )
					if( directionalMovementMinus <= 0.005812 )
						if( dx <= 66.659 )
							if( diPlus <= 9.56076 )
								if( smoothedDirectionalMovementPlus <= 0.000354 )
									ret := 0.208333
								if( smoothedDirectionalMovementPlus > 0.000354 )
									ret := 0.928571 // buy
							if( diPlus > 9.56076 )
								if( trueRange <= 0.005978 )
									ret := 0.714286 // buy
								if( trueRange > 0.005978 )
									ret := -0.340909
						if( dx > 66.659 )
							if( trueRange <= 0.006977 )
								if( smoothedDirectionalMovementMinus <= 0.001288 )
									ret := -0.400000
								if( smoothedDirectionalMovementMinus > 0.001288 )
									ret := -0.904762 // sell
							if( trueRange > 0.006977 )
								ret := 0.500000
					if( directionalMovementMinus > 0.005812 )
						if( trueRange <= 0.008456 )
							if( directionalMovementMinus <= 0.006291 )
								ret := 1.000000 // buy
							if( directionalMovementMinus > 0.006291 )
								ret := 0.714286 // buy
						if( trueRange > 0.008456 )
							ret := 0.125000
				if( dx > 68.7883 )
					if( dx <= 77.1255 )
						if( adx <= 80.4448 )
							if( adx <= 39.452 )
								if( smoothedDirectionalMovementPlus <= 0.000151 )
									ret := 0.769231 // buy
								if( smoothedDirectionalMovementPlus > 0.000151 )
									ret := 0.935065 // buy
							if( adx > 39.452 )
								if( diPlus <= 8.14151 )
									ret := 0.805310 // buy
								if( diPlus > 8.14151 )
									ret := 0.391304
						if( adx > 80.4448 )
							ret := 0.000000
					if( dx > 77.1255 )
						if( adx <= 79.9419 )
							if( diMinus <= 61.26 )
								if( adx <= 78.5363 )
									ret := 0.326531
								if( adx > 78.5363 )
									ret := -0.578947
							if( diMinus > 61.26 )
								if( smoothedTrueRange <= 0.00406 )
									ret := 0.876712 // buy
								if( smoothedTrueRange > 0.00406 )
									ret := 0.538462
						if( adx > 79.9419 )
							if( diPlus <= 3.43937 )
								ret := 1.000000 // buy
							if( diPlus > 3.43937 )
								ret := 0.650000
	if( diPlus > 10.7009 )
		if( trueRange <= 0.004319 )
			if( directionalMovementPlus <= 1e-06 )
				if( smoothedTrueRange <= 0.001646 )
					if( smoothedDirectionalMovementPlus <= 0.000126 )
						if( smoothedTrueRange <= 0.00078 )
							if( diMinus <= 34.593 )
								if( diPlus <= 13.7925 )
									ret := -0.050467
								if( diPlus > 13.7925 )
									ret := -0.000392
							if( diMinus > 34.593 )
								if( diPlus <= 12.2264 )
									ret := 0.068966
								if( diPlus > 12.2264 )
									ret := -0.141509
						if( smoothedTrueRange > 0.00078 )
							if( diMinus <= 33.5251 )
								if( adx <= 25.3911 )
									ret := -0.412475
								if( adx > 25.3911 )
									ret := -0.066158
							if( diMinus > 33.5251 )
								if( diMinus <= 34.4414 )
									ret := 0.348315
								if( diMinus > 34.4414 )
									ret := 0.026224
					if( smoothedDirectionalMovementPlus > 0.000126 )
						if( dx <= 62.07 )
							if( trueRange <= 0.00162 )
								if( smoothedDirectionalMovementPlus <= 0.000457 )
									ret := 0.018315
								if( smoothedDirectionalMovementPlus > 0.000457 )
									ret := 0.131957
							if( trueRange > 0.00162 )
								if( directionalMovementMinus <= 0.001612 )
									ret := -0.081360
								if( directionalMovementMinus > 0.001612 )
									ret := 0.082819
						if( dx > 62.07 )
							if( adx <= 73.5996 )
								if( adx <= 53.985 )
									ret := -0.047736
								if( adx > 53.985 )
									ret := -0.215447
							if( adx > 73.5996 )
								if( diMinus <= 7.58264 )
									ret := 0.175824
								if( diMinus > 7.58264 )
									ret := 1.000000 // buy
				if( smoothedTrueRange > 0.001646 )
					if( smoothedDirectionalMovementMinus <= 0.002386 )
						if( smoothedDirectionalMovementMinus <= 0.000861 )
							if( smoothedDirectionalMovementPlus <= 0.001739 )
								if( smoothedTrueRange <= 0.003767 )
									ret := 0.064006
								if( smoothedTrueRange > 0.003767 )
									ret := -0.177914
							if( smoothedDirectionalMovementPlus > 0.001739 )
								if( diMinus <= 1.8139 )
									ret := 1.000000 // buy
								if( diMinus > 1.8139 )
									ret := -0.357143
						if( smoothedDirectionalMovementMinus > 0.000861 )
							if( adx <= 15.6715 )
								if( smoothedTrueRange <= 0.003257 )
									ret := 0.235294
								if( smoothedTrueRange > 0.003257 )
									ret := 0.836066 // buy
							if( adx > 15.6715 )
								if( adx <= 16.7562 )
									ret := -0.928571 // sell
								if( adx > 16.7562 )
									ret := 0.133544
					if( smoothedDirectionalMovementMinus > 0.002386 )
						if( diMinus <= 47.4613 )
							ret := -1.000000 // sell
						if( diMinus > 47.4613 )
							ret := -0.666667
			if( directionalMovementPlus > 1e-06 )
				if( diPlus <= 14.3764 )
					if( diPlus <= 14.3524 )
						if( trueRange <= 0.001196 )
							if( adx <= 21.7054 )
								if( dx <= 6.42467 )
									ret := 0.377049
								if( dx > 6.42467 )
									ret := -0.340230
							if( adx > 21.7054 )
								if( directionalMovementPlus <= 4.3e-05 )
									ret := -0.213740
								if( directionalMovementPlus > 4.3e-05 )
									ret := -0.024934
						if( trueRange > 0.001196 )
							if( adx <= 13.7852 )
								if( directionalMovementMinus <= 0.000342 )
									ret := 0.797619 // buy
								if( directionalMovementMinus > 0.000342 )
									ret := 0.037037
							if( adx > 13.7852 )
								if( dx <= 62.7922 )
									ret := 0.046424
								if( dx > 62.7922 )
									ret := -0.805556 // sell
					if( diPlus > 14.3524 )
						if( smoothedDirectionalMovementMinus <= 0.000357 )
							if( directionalMovementPlus <= 0.000162 )
								ret := -0.210526
							if( directionalMovementPlus > 0.000162 )
								if( trueRange <= 0.000939 )
									ret := 0.266667
								if( trueRange > 0.000939 )
									ret := 0.727273 // buy
						if( smoothedDirectionalMovementMinus > 0.000357 )
							if( diMinus <= 35.6492 )
								if( directionalMovementPlus <= 0.000569 )
									ret := 1.000000 // buy
								if( directionalMovementPlus > 0.000569 )
									ret := 0.777778 // buy
							if( diMinus > 35.6492 )
								ret := 0.363636
				if( diPlus > 14.3764 )
					if( smoothedDirectionalMovementMinus <= 0.001251 )
						if( smoothedDirectionalMovementPlus <= 0.001284 )
							if( dx <= 85.4813 )
								if( dx <= 5.25701 )
									ret := 0.006539
								if( dx > 5.25701 )
									ret := -0.055569
							if( dx > 85.4813 )
								if( diMinus <= 1.15889 )
									ret := -0.255319
								if( diMinus > 1.15889 )
									ret := 0.251599
						if( smoothedDirectionalMovementPlus > 0.001284 )
							if( dx <= 64.3592 )
								if( trueRange <= 0.004117 )
									ret := -0.436214
								if( trueRange > 0.004117 )
									ret := 0.333333
							if( dx > 64.3592 )
								if( smoothedDirectionalMovementPlus <= 0.002488 )
									ret := -0.131474
								if( smoothedDirectionalMovementPlus > 0.002488 )
									ret := 0.809524 // buy
					if( smoothedDirectionalMovementMinus > 0.001251 )
						if( dx <= 29.7115 )
							if( dx <= 26.3639 )
								if( dx <= 5.34502 )
									ret := -0.727273 // sell
								if( dx > 5.34502 )
									ret := 0.395522
							if( dx > 26.3639 )
								if( smoothedTrueRange <= 0.004495 )
									ret := -0.333333
								if( smoothedTrueRange > 0.004495 )
									ret := -0.913043 // sell
						if( dx > 29.7115 )
							if( trueRange <= 0.002615 )
								if( smoothedDirectionalMovementPlus <= 0.000624 )
									ret := 0.700000 // buy
								if( smoothedDirectionalMovementPlus > 0.000624 )
									ret := -0.100000
							if( trueRange > 0.002615 )
								if( diPlus <= 14.5427 )
									ret := -0.166667
								if( diPlus > 14.5427 )
									ret := 0.852273 // buy
		if( trueRange > 0.004319 )
			if( directionalMovementMinus <= 0.002996 )
				if( adx <= 11.1304 )
					if( diPlus <= 22.4589 )
						ret := 0.875000 // buy
					if( diPlus > 22.4589 )
						ret := 0.733333 // buy
				if( adx > 11.1304 )
					if( diPlus <= 12.0638 )
						if( smoothedTrueRange <= 0.006785 )
							if( smoothedDirectionalMovementPlus <= 0.000396 )
								if( dx <= 51.4077 )
									ret := 0.076923
								if( dx > 51.4077 )
									ret := -0.555556
							if( smoothedDirectionalMovementPlus > 0.000396 )
								if( smoothedTrueRange <= 0.004726 )
									ret := 0.421053
								if( smoothedTrueRange > 0.004726 )
									ret := 0.883721 // buy
						if( smoothedTrueRange > 0.006785 )
							if( trueRange <= 0.005227 )
								ret := -0.818182 // sell
							if( trueRange > 0.005227 )
								if( smoothedDirectionalMovementPlus <= 0.001 )
									ret := -0.272727
								if( smoothedDirectionalMovementPlus > 0.001 )
									ret := 0.500000
					if( diPlus > 12.0638 )
						if( directionalMovementMinus <= 0.002361 )
							if( smoothedDirectionalMovementMinus <= 0.000855 )
								if( adx <= 14.4862 )
									ret := -0.611111
								if( adx > 14.4862 )
									ret := -0.185211
							if( smoothedDirectionalMovementMinus > 0.000855 )
								if( diPlus <= 14.2706 )
									ret := -0.244635
								if( diPlus > 14.2706 )
									ret := 0.048452
						if( directionalMovementMinus > 0.002361 )
							if( smoothedDirectionalMovementMinus <= 0.000481 )
								if( directionalMovementMinus <= 0.002629 )
									ret := -0.535714
								if( directionalMovementMinus > 0.002629 )
									ret := 0.360000
							if( smoothedDirectionalMovementMinus > 0.000481 )
								if( smoothedTrueRange <= 0.003254 )
									ret := -0.663043
								if( smoothedTrueRange > 0.003254 )
									ret := -0.360825
			if( directionalMovementMinus > 0.002996 )
				if( dx <= 64.2511 )
					if( adx <= 15.6455 )
						if( smoothedDirectionalMovementPlus <= 0.000997 )
							if( directionalMovementMinus <= 0.003657 )
								ret := 0.090909
							if( directionalMovementMinus > 0.003657 )
								if( smoothedDirectionalMovementMinus <= 0.000939 )
									ret := -0.441176
								if( smoothedDirectionalMovementMinus > 0.000939 )
									ret := -0.785714 // sell
						if( smoothedDirectionalMovementPlus > 0.000997 )
							ret := 0.500000
					if( adx > 15.6455 )
						if( trueRange <= 0.006029 )
							if( directionalMovementMinus <= 0.005257 )
								if( smoothedTrueRange <= 0.001569 )
									ret := 0.346154
								if( smoothedTrueRange > 0.001569 )
									ret := -0.053356
							if( directionalMovementMinus > 0.005257 )
								ret := -0.777778 // sell
						if( trueRange > 0.006029 )
							if( diPlus <= 20.5985 )
								if( adx <= 50.6543 )
									ret := 0.277311
								if( adx > 50.6543 )
									ret := 0.906977 // buy
							if( diPlus > 20.5985 )
								if( diMinus <= 10.9705 )
									ret := -0.833333 // sell
								if( diMinus > 10.9705 )
									ret := 0.066327
				if( dx > 64.2511 )
					if( directionalMovementMinus <= 0.005011 )
						if( smoothedDirectionalMovementPlus <= 0.002235 )
							ret := 0.000000
						if( smoothedDirectionalMovementPlus > 0.002235 )
							ret := 1.000000 // buy
					if( directionalMovementMinus > 0.005011 )
						ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_XRPUSDT_5Min_7fd79fd9(trueRange, diPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, adx, smoothedDirectionalMovementMinus, dx, directionalMovementPlus, directionalMovementMinus, diMinus)

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


