//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: AMD_30Min_1M00_9ff41224 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1M00_9ff41224", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_9ff41224(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( MFI_Low <= 57.8965 )
		if( Raw_Money_Flow <= 775329 )
			if( Typical_Price <= 6.80158 )
				if( Positive_Money_Flow <= 27.5735 )
					if( Money_Flow_Ratio <= 0.486454 )
						if( Typical_Price <= 2.23658 )
							if( Negative_Money_Flow_Sum <= 1.01681e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.01681e+07 )
								if( MFI <= 21.4589 )
									ret := -0.636364
								if( MFI > 21.4589 )
									ret := 0.000000
						if( Typical_Price > 2.23658 )
							if( Money_Flow_Ratio <= 0.119512 )
								if( Money_Flow_Ratio <= 0.05628 )
									ret := 0.146341
								if( Money_Flow_Ratio > 0.05628 )
									ret := 0.967742 // buy
							if( Money_Flow_Ratio > 0.119512 )
								if( Negative_Money_Flow_Sum <= 1.63377e+07 )
									ret := -0.202128
								if( Negative_Money_Flow_Sum > 1.63377e+07 )
									ret := 0.348387
					if( Money_Flow_Ratio > 0.486454 )
						if( MFI_High <= -12.1739 )
							if( MFI <= 59.9547 )
								if( MFI_High <= -34.6692 )
									ret := 0.619565
								if( MFI_High > -34.6692 )
									ret := 0.362963
							if( MFI > 59.9547 )
								if( Negative_Money_Flow_Sum <= 4.33304e+06 )
									ret := 0.550000
								if( Negative_Money_Flow_Sum > 4.33304e+06 )
									ret := -0.236220
						if( MFI_High > -12.1739 )
							if( Negative_Money_Flow <= 82788 )
								if( Negative_Money_Flow <= 166.681 )
									ret := 0.333333
								if( Negative_Money_Flow > 166.681 )
									ret := 0.897196 // buy
							if( Negative_Money_Flow > 82788 )
								if( Positive_Money_Flow_Sum <= 1.50645e+07 )
									ret := -0.461538
								if( Positive_Money_Flow_Sum > 1.50645e+07 )
									ret := 0.785714 // buy
				if( Positive_Money_Flow > 27.5735 )
					if( MFI_Low <= 47.9294 )
						if( Positive_Money_Flow_Sum <= 4.74418e+06 )
							if( Negative_Money_Flow_Sum <= 1.84078e+07 )
								if( Typical_Price <= 1.88867 )
									ret := 1.000000 // buy
								if( Typical_Price > 1.88867 )
									ret := -0.526316
							if( Negative_Money_Flow_Sum > 1.84078e+07 )
								if( MFI_High <= -67.0671 )
									ret := 0.431373
								if( MFI_High > -67.0671 )
									ret := -0.285714
						if( Positive_Money_Flow_Sum > 4.74418e+06 )
							if( Negative_Money_Flow <= 3581.58 )
								if( MFI_High <= -34.0657 )
									ret := 0.125891
								if( MFI_High > -34.0657 )
									ret := 0.353604
							if( Negative_Money_Flow > 3581.58 )
								if( MFI_High <= -22.6732 )
									ret := 0.142857
								if( MFI_High > -22.6732 )
									ret := -0.319149
					if( MFI_Low > 47.9294 )
						if( Positive_Money_Flow_Sum <= 9.4888e+06 )
							if( Typical_Price <= 2.12731 )
								ret := 0.400000
							if( Typical_Price > 2.12731 )
								ret := 0.888889 // buy
						if( Positive_Money_Flow_Sum > 9.4888e+06 )
							if( MFI <= 71.6898 )
								if( Positive_Money_Flow <= 8795.59 )
									ret := -0.967742 // sell
								if( Positive_Money_Flow > 8795.59 )
									ret := -0.571429
							if( MFI > 71.6898 )
								if( Typical_Price <= 3.73333 )
									ret := -0.538462
								if( Typical_Price > 3.73333 )
									ret := 0.313725
			if( Typical_Price > 6.80158 )
				if( MFI_Low <= -19.2211 )
					if( Typical_Price <= 65.3485 )
						if( Negative_Money_Flow_Sum <= 1.48375e+08 )
							if( Raw_Money_Flow <= 124314 )
								ret := 0.428571
							if( Raw_Money_Flow > 124314 )
								if( Raw_Money_Flow <= 191488 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 191488 )
									ret := 0.700000 // buy
						if( Negative_Money_Flow_Sum > 1.48375e+08 )
							if( Typical_Price <= 59.24 )
								if( Negative_Money_Flow_Sum <= 1.01128e+09 )
									ret := 0.106061
								if( Negative_Money_Flow_Sum > 1.01128e+09 )
									ret := 0.473684
							if( Typical_Price > 59.24 )
								ret := 0.866667 // buy
					if( Typical_Price > 65.3485 )
						if( Negative_Money_Flow <= 487248 )
							if( Money_Flow_Ratio <= 0.004913 )
								ret := 0.000000
							if( Money_Flow_Ratio > 0.004913 )
								if( Typical_Price <= 109.058 )
									ret := 0.075472
								if( Typical_Price > 109.058 )
									ret := 0.571429
						if( Negative_Money_Flow > 487248 )
							ret := -0.307692
				if( MFI_Low > -19.2211 )
					if( Positive_Money_Flow_Sum <= 8.33663e+06 )
						if( Negative_Money_Flow_Sum <= 1.8975e+06 )
							if( Money_Flow_Ratio <= 1.86565 )
								if( Money_Flow_Ratio <= 0.912477 )
									ret := 0.086957
								if( Money_Flow_Ratio > 0.912477 )
									ret := -0.337209
							if( Money_Flow_Ratio > 1.86565 )
								if( MFI_Low <= 52.6762 )
									ret := -0.805825 // sell
								if( MFI_Low > 52.6762 )
									ret := -0.527778
						if( Negative_Money_Flow_Sum > 1.8975e+06 )
							if( Raw_Money_Flow <= 24376.4 )
								if( Negative_Money_Flow_Sum <= 1.11706e+08 )
									ret := 0.035714
								if( Negative_Money_Flow_Sum > 1.11706e+08 )
									ret := 0.535211
							if( Raw_Money_Flow > 24376.4 )
								if( Negative_Money_Flow_Sum <= 2.43356e+07 )
									ret := 0.119481
								if( Negative_Money_Flow_Sum > 2.43356e+07 )
									ret := -0.095469
					if( Positive_Money_Flow_Sum > 8.33663e+06 )
						if( Money_Flow_Ratio <= 2.39209 )
							if( Typical_Price <= 11.5335 )
								if( MFI <= 17.6731 )
									ret := -0.358491
								if( MFI > 17.6731 )
									ret := -0.000570
							if( Typical_Price > 11.5335 )
								if( MFI <= 1.64545 )
									ret := -0.175926
								if( MFI > 1.64545 )
									ret := 0.082740
						if( Money_Flow_Ratio > 2.39209 )
							if( Positive_Money_Flow_Sum <= 9.52295e+07 )
								if( Money_Flow_Ratio <= 3.38748 )
									ret := -0.082353
								if( Money_Flow_Ratio > 3.38748 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 9.52295e+07 )
								if( Positive_Money_Flow_Sum <= 2.03183e+08 )
									ret := 0.489474
								if( Positive_Money_Flow_Sum > 2.03183e+08 )
									ret := 0.134021
		if( Raw_Money_Flow > 775329 )
			if( Negative_Money_Flow_Sum <= 4.18147e+09 )
				if( Negative_Money_Flow_Sum <= 1.56476e+08 )
					if( MFI <= 18.4658 )
						if( MFI_High <= -61.7365 )
							if( Raw_Money_Flow <= 1.6336e+06 )
								if( Positive_Money_Flow_Sum <= 5.75566e+06 )
									ret := -0.287611
								if( Positive_Money_Flow_Sum > 5.75566e+06 )
									ret := 0.313725
							if( Raw_Money_Flow > 1.6336e+06 )
								if( Negative_Money_Flow <= 1335.38 )
									ret := -0.266272
								if( Negative_Money_Flow > 1335.38 )
									ret := 0.150833
						if( MFI_High > -61.7365 )
							if( Negative_Money_Flow_Sum <= 2.43082e+07 )
								ret := 0.454545
							if( Negative_Money_Flow_Sum > 2.43082e+07 )
								ret := 1.000000 // buy
					if( MFI > 18.4658 )
						if( Positive_Money_Flow <= 2.47807e+07 )
							if( MFI_Low <= 56.3312 )
								if( Negative_Money_Flow_Sum <= 1.45451e+08 )
									ret := -0.077231
								if( Negative_Money_Flow_Sum > 1.45451e+08 )
									ret := -0.468880
							if( MFI_Low > 56.3312 )
								if( MFI_Low <= 56.397 )
									ret := -0.846154 // sell
								if( MFI_Low > 56.397 )
									ret := -0.264398
						if( Positive_Money_Flow > 2.47807e+07 )
							if( Positive_Money_Flow_Sum <= 5.4635e+07 )
								if( Raw_Money_Flow <= 3.66319e+07 )
									ret := -0.195122
								if( Raw_Money_Flow > 3.66319e+07 )
									ret := 0.680000
							if( Positive_Money_Flow_Sum > 5.4635e+07 )
								if( Typical_Price <= 124.077 )
									ret := -0.245383
								if( Typical_Price > 124.077 )
									ret := -0.611607
				if( Negative_Money_Flow_Sum > 1.56476e+08 )
					if( Negative_Money_Flow <= 8.31931e+08 )
						if( Negative_Money_Flow <= 22009 )
							if( Positive_Money_Flow_Sum <= 3.79543e+09 )
								if( Negative_Money_Flow_Sum <= 7.4166e+08 )
									ret := 0.013807
								if( Negative_Money_Flow_Sum > 7.4166e+08 )
									ret := -0.064896
							if( Positive_Money_Flow_Sum > 3.79543e+09 )
								if( Raw_Money_Flow <= 3.41952e+06 )
									ret := 0.512500
								if( Raw_Money_Flow > 3.41952e+06 )
									ret := 0.067568
						if( Negative_Money_Flow > 22009 )
							if( Raw_Money_Flow <= 3.22125e+07 )
								if( Typical_Price <= 118 )
									ret := 0.060341
								if( Typical_Price > 118 )
									ret := 0.189526
							if( Raw_Money_Flow > 3.22125e+07 )
								if( Money_Flow_Ratio <= 1.51453 )
									ret := -0.038498
								if( Money_Flow_Ratio > 1.51453 )
									ret := 0.052687
					if( Negative_Money_Flow > 8.31931e+08 )
						if( MFI_Low <= 6.2736 )
							if( Negative_Money_Flow_Sum <= 1.66641e+09 )
								if( Typical_Price <= 157.634 )
									ret := -0.146667
								if( Typical_Price > 157.634 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 1.66641e+09 )
								if( Raw_Money_Flow <= 2.01319e+09 )
									ret := -0.498721
								if( Raw_Money_Flow > 2.01319e+09 )
									ret := 0.060606
						if( MFI_Low > 6.2736 )
							if( Raw_Money_Flow <= 8.39308e+08 )
								ret := 0.866667 // buy
							if( Raw_Money_Flow > 8.39308e+08 )
								if( Raw_Money_Flow <= 1.66424e+09 )
									ret := 0.040431
								if( Raw_Money_Flow > 1.66424e+09 )
									ret := -0.666667
			if( Negative_Money_Flow_Sum > 4.18147e+09 )
				if( Negative_Money_Flow_Sum <= 1.09039e+10 )
					if( Money_Flow_Ratio <= 0.015295 )
						if( MFI_Low <= -19.678 )
							ret := 0.166667
						if( MFI_Low > -19.678 )
							if( Typical_Price <= 165.091 )
								if( MFI_High <= -78.7611 )
									ret := -0.640000
								if( MFI_High > -78.7611 )
									ret := -1.000000 // sell
							if( Typical_Price > 165.091 )
								ret := 0.307692
					if( Money_Flow_Ratio > 0.015295 )
						if( Money_Flow_Ratio <= 1.42114 )
							if( Positive_Money_Flow <= 3.46907e+08 )
								if( Negative_Money_Flow <= 2.86442e+08 )
									ret := 0.094697
								if( Negative_Money_Flow > 2.86442e+08 )
									ret := -0.150735
							if( Positive_Money_Flow > 3.46907e+08 )
								if( Negative_Money_Flow_Sum <= 6.25155e+09 )
									ret := -0.390788
								if( Negative_Money_Flow_Sum > 6.25155e+09 )
									ret := 0.096000
						if( Money_Flow_Ratio > 1.42114 )
							if( Positive_Money_Flow <= 1.32129e+06 )
								if( Typical_Price <= 181.744 )
									ret := -0.188406
								if( Typical_Price > 181.744 )
									ret := 0.583333
							if( Positive_Money_Flow > 1.32129e+06 )
								if( Negative_Money_Flow_Sum <= 5.61537e+09 )
									ret := 0.216667
								if( Negative_Money_Flow_Sum > 5.61537e+09 )
									ret := 0.700000 // buy
				if( Negative_Money_Flow_Sum > 1.09039e+10 )
					if( Typical_Price <= 109.813 )
						ret := 0.000000
					if( Typical_Price > 109.813 )
						if( MFI_Low <= -4.90518 )
							if( Negative_Money_Flow_Sum <= 1.19143e+10 )
								ret := -0.823529 // sell
							if( Negative_Money_Flow_Sum > 1.19143e+10 )
								ret := 0.083333
						if( MFI_Low > -4.90518 )
							if( Money_Flow_Ratio <= 0.521639 )
								if( Negative_Money_Flow <= 4.20547e+06 )
									ret := -0.965517 // sell
								if( Negative_Money_Flow > 4.20547e+06 )
									ret := -0.578947
							if( Money_Flow_Ratio > 0.521639 )
								ret := -1.000000 // sell
	if( MFI_Low > 57.8965 )
		if( Raw_Money_Flow <= 1.13984e+06 )
			if( MFI <= 94.9855 )
				if( MFI <= 89.4894 )
					if( Typical_Price <= 11.0101 )
						if( Negative_Money_Flow_Sum <= 141959 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 141959 )
							if( Typical_Price <= 2.13735 )
								if( Positive_Money_Flow <= 2149.13 )
									ret := 0.133333
								if( Positive_Money_Flow > 2149.13 )
									ret := -0.588235
							if( Typical_Price > 2.13735 )
								if( Raw_Money_Flow <= 13314.8 )
									ret := 0.000000
								if( Raw_Money_Flow > 13314.8 )
									ret := 0.476496
					if( Typical_Price > 11.0101 )
						if( Negative_Money_Flow <= 349771 )
							if( Negative_Money_Flow_Sum <= 1.0284e+08 )
								if( Negative_Money_Flow <= 82889.9 )
									ret := -0.012121
								if( Negative_Money_Flow > 82889.9 )
									ret := -0.303704
							if( Negative_Money_Flow_Sum > 1.0284e+08 )
								if( Raw_Money_Flow <= 352328 )
									ret := 0.083333
								if( Raw_Money_Flow > 352328 )
									ret := 0.301370
						if( Negative_Money_Flow > 349771 )
							if( Negative_Money_Flow <= 501995 )
								if( Raw_Money_Flow <= 448384 )
									ret := 0.230769
								if( Raw_Money_Flow > 448384 )
									ret := 0.820513 // buy
							if( Negative_Money_Flow > 501995 )
								if( Negative_Money_Flow_Sum <= 6.76101e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 6.76101e+07 )
									ret := 0.380952
				if( MFI > 89.4894 )
					if( Negative_Money_Flow <= 76639.9 )
						if( MFI_High <= 9.58529 )
							ret := 1.000000 // buy
						if( MFI_High > 9.58529 )
							if( Positive_Money_Flow_Sum <= 4.47097e+06 )
								if( MFI <= 91.1576 )
									ret := 0.727273 // buy
								if( MFI > 91.1576 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 4.47097e+06 )
								if( Typical_Price <= 2.69713 )
									ret := -0.538462
								if( Typical_Price > 2.69713 )
									ret := 0.213235
					if( Negative_Money_Flow > 76639.9 )
						if( Positive_Money_Flow_Sum <= 3.62278e+07 )
							if( Negative_Money_Flow_Sum <= 1.27295e+06 )
								ret := 0.866667 // buy
							if( Negative_Money_Flow_Sum > 1.27295e+06 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 3.62278e+07 )
							if( Money_Flow_Ratio <= 14.7942 )
								if( Negative_Money_Flow <= 221220 )
									ret := 0.862069 // buy
								if( Negative_Money_Flow > 221220 )
									ret := 0.356436
							if( Money_Flow_Ratio > 14.7942 )
								if( MFI_High <= 14.7149 )
									ret := -0.166667
								if( MFI_High > 14.7149 )
									ret := 0.555556
			if( MFI > 94.9855 )
				if( Typical_Price <= 3.88536 )
					if( Typical_Price <= 2.68633 )
						ret := 0.444444
					if( Typical_Price > 2.68633 )
						ret := 0.818182 // buy
				if( Typical_Price > 3.88536 )
					if( Typical_Price <= 7.77078 )
						if( Typical_Price <= 4.68419 )
							ret := -0.882353 // sell
						if( Typical_Price > 4.68419 )
							if( Negative_Money_Flow <= 96658.2 )
								if( Money_Flow_Ratio <= 44.3797 )
									ret := -0.666667
								if( Money_Flow_Ratio > 44.3797 )
									ret := 0.222222
							if( Negative_Money_Flow > 96658.2 )
								if( Typical_Price <= 6.96452 )
									ret := -0.285714
								if( Typical_Price > 6.96452 )
									ret := -0.933333 // sell
					if( Typical_Price > 7.77078 )
						if( Typical_Price <= 29.2092 )
							if( Raw_Money_Flow <= 1.05429e+06 )
								if( MFI <= 99.5297 )
									ret := 0.186555
								if( MFI > 99.5297 )
									ret := -0.081081
							if( Raw_Money_Flow > 1.05429e+06 )
								if( MFI_High <= 18.0677 )
									ret := 0.923077 // buy
								if( MFI_High > 18.0677 )
									ret := 0.666667
						if( Typical_Price > 29.2092 )
							if( MFI <= 96.426 )
								if( Typical_Price <= 53.5017 )
									ret := -0.459459
								if( Typical_Price > 53.5017 )
									ret := -0.048387
							if( MFI > 96.426 )
								if( Raw_Money_Flow <= 665863 )
									ret := 0.008052
								if( Raw_Money_Flow > 665863 )
									ret := 0.200000
		if( Raw_Money_Flow > 1.13984e+06 )
			if( MFI_Low <= 79.1705 )
				if( Positive_Money_Flow_Sum <= 1.84401e+07 )
					if( Raw_Money_Flow <= 3.74927e+06 )
						if( Positive_Money_Flow_Sum <= 1.22281e+07 )
							if( Positive_Money_Flow <= 1.85667e+06 )
								if( Negative_Money_Flow_Sum <= 2.09863e+06 )
									ret := -0.321429
								if( Negative_Money_Flow_Sum > 2.09863e+06 )
									ret := 0.468750
							if( Positive_Money_Flow > 1.85667e+06 )
								if( MFI <= 81.1922 )
									ret := -0.076923
								if( MFI > 81.1922 )
									ret := 0.353383
						if( Positive_Money_Flow_Sum > 1.22281e+07 )
							if( Raw_Money_Flow <= 2.24898e+06 )
								if( Raw_Money_Flow <= 1.24097e+06 )
									ret := 0.200000
								if( Raw_Money_Flow > 1.24097e+06 )
									ret := -0.263158
							if( Raw_Money_Flow > 2.24898e+06 )
								if( MFI_High <= 8.11352 )
									ret := -0.842105 // sell
								if( MFI_High > 8.11352 )
									ret := -0.407407
					if( Raw_Money_Flow > 3.74927e+06 )
						if( Positive_Money_Flow_Sum <= 1.66016e+07 )
							if( Positive_Money_Flow_Sum <= 1.48727e+07 )
								if( MFI_High <= 1.75673 )
									ret := -0.300000
								if( MFI_High > 1.75673 )
									ret := -0.715686 // sell
							if( Positive_Money_Flow_Sum > 1.48727e+07 )
								if( Typical_Price <= 76.7022 )
									ret := -1.000000 // sell
								if( Typical_Price > 76.7022 )
									ret := -0.909091 // sell
						if( Positive_Money_Flow_Sum > 1.66016e+07 )
							if( Typical_Price <= 75.7361 )
								if( Money_Flow_Ratio <= 6.83205 )
									ret := -0.925926 // sell
								if( Money_Flow_Ratio > 6.83205 )
									ret := 0.125000
							if( Typical_Price > 75.7361 )
								ret := 0.380952
				if( Positive_Money_Flow_Sum > 1.84401e+07 )
					if( Money_Flow_Ratio <= 388.395 )
						if( Money_Flow_Ratio <= 143.287 )
							if( Negative_Money_Flow_Sum <= 2.33609e+07 )
								if( Positive_Money_Flow <= 7.19903e+08 )
									ret := 0.076399
								if( Positive_Money_Flow > 7.19903e+08 )
									ret := 0.396396
							if( Negative_Money_Flow_Sum > 2.33609e+07 )
								if( Typical_Price <= 5.22748 )
									ret := 0.939394 // buy
								if( Typical_Price > 5.22748 )
									ret := 0.009902
						if( Money_Flow_Ratio > 143.287 )
							if( Typical_Price <= 26.8055 )
								if( MFI_High <= 17.3445 )
									ret := 0.166667
								if( MFI_High > 17.3445 )
									ret := 0.742857 // buy
							if( Typical_Price > 26.8055 )
								if( Negative_Money_Flow_Sum <= 4.60084e+06 )
									ret := 0.466667
								if( Negative_Money_Flow_Sum > 4.60084e+06 )
									ret := -0.215190
					if( Money_Flow_Ratio > 388.395 )
						if( MFI_High <= 18.6283 )
							if( MFI_Low <= 76.9711 )
								if( Positive_Money_Flow <= 3.1557e+07 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow > 3.1557e+07 )
									ret := -1.000000 // sell
							if( MFI_Low > 76.9711 )
								ret := -1.000000 // sell
						if( MFI_High > 18.6283 )
							ret := -0.043478
			if( MFI_Low > 79.1705 )
				if( Typical_Price <= 19.5664 )
					if( Positive_Money_Flow <= 1.85366e+08 )
						if( Positive_Money_Flow <= 1.00698e+07 )
							if( Negative_Money_Flow_Sum <= 448492 )
								if( MFI_High <= 19.8077 )
									ret := 0.689655
								if( MFI_High > 19.8077 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 448492 )
								ret := -0.416667
						if( Positive_Money_Flow > 1.00698e+07 )
							if( Raw_Money_Flow <= 7.20343e+07 )
								if( Typical_Price <= 5.16226 )
									ret := 0.930233 // buy
								if( Typical_Price > 5.16226 )
									ret := 0.610837
							if( Raw_Money_Flow > 7.20343e+07 )
								if( Raw_Money_Flow <= 1.26835e+08 )
									ret := -0.016129
								if( Raw_Money_Flow > 1.26835e+08 )
									ret := 0.804348 // buy
					if( Positive_Money_Flow > 1.85366e+08 )
						if( Negative_Money_Flow_Sum <= 2.28824e+06 )
							ret := -0.812500 // sell
						if( Negative_Money_Flow_Sum > 2.28824e+06 )
							ret := 0.428571
				if( Typical_Price > 19.5664 )
					if( Positive_Money_Flow <= 1.39381e+08 )
						if( MFI_Low <= 79.7374 )
							if( Negative_Money_Flow <= 27744 )
								if( Positive_Money_Flow <= 9.88732e+07 )
									ret := -0.528571
								if( Positive_Money_Flow > 9.88732e+07 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 27744 )
								if( Positive_Money_Flow_Sum <= 1.59745e+09 )
									ret := -0.351351
								if( Positive_Money_Flow_Sum > 1.59745e+09 )
									ret := 0.392857
						if( MFI_Low > 79.7374 )
							if( Money_Flow_Ratio <= 797.431 )
								if( MFI <= 99.8131 )
									ret := 0.466667
								if( MFI > 99.8131 )
									ret := 0.923077 // buy
							if( Money_Flow_Ratio > 797.431 )
								ret := -0.230769
					if( Positive_Money_Flow > 1.39381e+08 )
						if( Positive_Money_Flow <= 2.42534e+08 )
							if( MFI <= 99.2983 )
								if( Typical_Price <= 62.0367 )
									ret := -0.166667
								if( Typical_Price > 62.0367 )
									ret := 0.428571
							if( MFI > 99.2983 )
								if( Positive_Money_Flow <= 2.18064e+08 )
									ret := 0.462687
								if( Positive_Money_Flow > 2.18064e+08 )
									ret := 0.875000 // buy
						if( Positive_Money_Flow > 2.42534e+08 )
							if( MFI_Low <= 79.2945 )
								if( Raw_Money_Flow <= 1.28505e+09 )
									ret := 0.605769
								if( Raw_Money_Flow > 1.28505e+09 )
									ret := -0.200000
							if( MFI_Low > 79.2945 )
								if( Money_Flow_Ratio <= 392.89 )
									ret := -0.028169
								if( Money_Flow_Ratio > 392.89 )
									ret := 0.320000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_AMD_30Min_9ff41224(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


