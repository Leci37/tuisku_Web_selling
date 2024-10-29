//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: MSFT_5Min_2MV0_75b7fd1b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2MV0_75b7fd1b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_75b7fd1b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Money_Flow_Ratio <= 0.582213 )
		if( Negative_Money_Flow_Sum <= 5.70072e+08 )
			if( VIP_VIM <= -0.236207 )
				if( MFI <= 15.4074 )
					if( VIP_VIM <= -0.955769 )
						if( Raw_Money_Flow <= 836307 )
							if( Positive_Money_Flow <= 150174 )
								if( Positive_Money_Flow_Sum <= 490092 )
									ret := 0.272727
								if( Positive_Money_Flow_Sum > 490092 )
									ret := 0.603960
							if( Positive_Money_Flow > 150174 )
								if( VIP_VIM <= -1.22178 )
									ret := 0.166667
								if( VIP_VIM > -1.22178 )
									ret := -0.266667
						if( Raw_Money_Flow > 836307 )
							if( Negative_Money_Flow_Sum <= 2.4912e+07 )
								if( Negative_Money_Flow_Sum <= 6.78898e+06 )
									ret := 0.150000
								if( Negative_Money_Flow_Sum > 6.78898e+06 )
									ret := 0.741935 // buy
							if( Negative_Money_Flow_Sum > 2.4912e+07 )
								ret := -0.071429
					if( VIP_VIM > -0.955769 )
						if( VIP <= 0.727338 )
							if( MFI <= 2.39943 )
								if( Raw_Money_Flow <= 2.40462e+08 )
									ret := 0.679487
								if( Raw_Money_Flow > 2.40462e+08 )
									ret := -0.350000
							if( MFI > 2.39943 )
								if( Negative_Money_Flow <= 2.62833e+08 )
									ret := 0.028455
								if( Negative_Money_Flow > 2.62833e+08 )
									ret := -0.360000
						if( VIP > 0.727338 )
							if( Negative_Money_Flow <= 1.21584e+07 )
								if( MFI <= 1.10132 )
									ret := -0.269231
								if( MFI > 1.10132 )
									ret := 0.310552
							if( Negative_Money_Flow > 1.21584e+07 )
								if( MFI_High <= -77.2697 )
									ret := 0.224490
								if( MFI_High > -77.2697 )
									ret := 0.829268 // buy
				if( MFI > 15.4074 )
					if( Positive_Money_Flow_Sum <= 1.64159e+06 )
						if( Raw_Money_Flow <= 107195 )
							if( Positive_Money_Flow_Sum <= 1.31883e+06 )
								if( Typical_Price <= 340.181 )
									ret := -0.293478
								if( Typical_Price > 340.181 )
									ret := 0.369565
							if( Positive_Money_Flow_Sum > 1.31883e+06 )
								if( VIP <= 2.35324 )
									ret := -0.865854 // sell
								if( VIP > 2.35324 )
									ret := -0.473684
						if( Raw_Money_Flow > 107195 )
							if( Negative_Money_Flow_Sum <= 1.32862e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.32862e+06 )
								if( MFI_Low <= -4.52196 )
									ret := -1.000000 // sell
								if( MFI_Low > -4.52196 )
									ret := 0.119904
					if( Positive_Money_Flow_Sum > 1.64159e+06 )
						if( Raw_Money_Flow <= 1.26022e+06 )
							if( Negative_Money_Flow_Sum <= 8.77813e+06 )
								if( Typical_Price <= 445.516 )
									ret := 0.185214
								if( Typical_Price > 445.516 )
									ret := -0.234375
							if( Negative_Money_Flow_Sum > 8.77813e+06 )
								if( Negative_Money_Flow_Sum <= 1.08798e+07 )
									ret := 0.641221
								if( Negative_Money_Flow_Sum > 1.08798e+07 )
									ret := 0.278261
						if( Raw_Money_Flow > 1.26022e+06 )
							if( Money_Flow_Ratio <= 0.54917 )
								if( Money_Flow_Ratio <= 0.186871 )
									ret := -0.550000
								if( Money_Flow_Ratio > 0.186871 )
									ret := 0.149505
							if( Money_Flow_Ratio > 0.54917 )
								if( Positive_Money_Flow_Sum <= 2.52871e+08 )
									ret := 0.057522
								if( Positive_Money_Flow_Sum > 2.52871e+08 )
									ret := -0.393443
			if( VIP_VIM > -0.236207 )
				if( VIM <= 1.13935 )
					if( Negative_Money_Flow_Sum <= 4.5046e+08 )
						if( Negative_Money_Flow_Sum <= 3.871e+08 )
							if( MFI_High <= -70.0767 )
								if( VIM <= 0.728099 )
									ret := -0.666667
								if( VIM > 0.728099 )
									ret := 0.339623
							if( MFI_High > -70.0767 )
								if( Positive_Money_Flow_Sum <= 1.66501e+07 )
									ret := 0.184573
								if( Positive_Money_Flow_Sum > 1.66501e+07 )
									ret := -0.131227
						if( Negative_Money_Flow_Sum > 3.871e+08 )
							if( MFI_Low <= 14.9294 )
								if( Typical_Price <= 337.528 )
									ret := -0.718750 // sell
								if( Typical_Price > 337.528 )
									ret := -0.190265
							if( MFI_Low > 14.9294 )
								if( VIP_VIM <= -0.066411 )
									ret := 0.608696
								if( VIP_VIM > -0.066411 )
									ret := -0.160000
					if( Negative_Money_Flow_Sum > 4.5046e+08 )
						if( Typical_Price <= 439.505 )
							if( Positive_Money_Flow <= 374379 )
								if( MFI_Low <= -16.3195 )
									ret := 0.000000
								if( MFI_Low > -16.3195 )
									ret := 0.510638
							if( Positive_Money_Flow > 374379 )
								if( Raw_Money_Flow <= 1.23575e+06 )
									ret := -0.533333
								if( Raw_Money_Flow > 1.23575e+06 )
									ret := 0.265918
						if( Typical_Price > 439.505 )
							if( Raw_Money_Flow <= 4.755e+07 )
								ret := -0.944444 // sell
							if( Raw_Money_Flow > 4.755e+07 )
								ret := 0.000000
				if( VIM > 1.13935 )
					if( VIM <= 4.43522 )
						if( MFI_High <= -53.6396 )
							if( MFI_High <= -78.3514 )
								if( Negative_Money_Flow_Sum <= 4.34294e+08 )
									ret := -0.234375
								if( Negative_Money_Flow_Sum > 4.34294e+08 )
									ret := -0.703704 // sell
							if( MFI_High > -78.3514 )
								if( Positive_Money_Flow <= 1.4182e+06 )
									ret := 0.101695
								if( Positive_Money_Flow > 1.4182e+06 )
									ret := -0.567568
						if( MFI_High > -53.6396 )
							if( Negative_Money_Flow_Sum <= 3.51117e+06 )
								if( Typical_Price <= 406.487 )
									ret := 0.337423
								if( Typical_Price > 406.487 )
									ret := 0.039474
							if( Negative_Money_Flow_Sum > 3.51117e+06 )
								if( Negative_Money_Flow_Sum <= 4.99147e+06 )
									ret := -0.409091
								if( Negative_Money_Flow_Sum > 4.99147e+06 )
									ret := -0.139651
					if( VIM > 4.43522 )
						if( Typical_Price <= 335.59 )
							ret := -0.875000 // sell
						if( Typical_Price > 335.59 )
							if( Negative_Money_Flow_Sum <= 2.58267e+06 )
								ret := -0.944444 // sell
							if( Negative_Money_Flow_Sum > 2.58267e+06 )
								if( VIM <= 5.94404 )
									ret := 0.300000
								if( VIM > 5.94404 )
									ret := -0.190476
		if( Negative_Money_Flow_Sum > 5.70072e+08 )
			if( Positive_Money_Flow_Sum <= 1.18068e+09 )
				if( MFI_Low <= 8.15752 )
					if( VIP <= 0.823316 )
						if( VIP_VIM <= -0.1731 )
							if( VIP <= 0.624707 )
								if( MFI <= 21.8841 )
									ret := -0.104061
								if( MFI > 21.8841 )
									ret := -0.828947 // sell
							if( VIP > 0.624707 )
								if( Negative_Money_Flow <= 2.58845e+09 )
									ret := 0.030955
								if( Negative_Money_Flow > 2.58845e+09 )
									ret := -1.000000 // sell
						if( VIP_VIM > -0.1731 )
							ret := 1.000000 // buy
					if( VIP > 0.823316 )
						if( Negative_Money_Flow <= 1.87812e+08 )
							if( Raw_Money_Flow <= 4.49466e+06 )
								if( Negative_Money_Flow <= 2.50362e+06 )
									ret := -0.029692
								if( Negative_Money_Flow > 2.50362e+06 )
									ret := 0.304348
							if( Raw_Money_Flow > 4.49466e+06 )
								if( Money_Flow_Ratio <= 0.213784 )
									ret := -0.368932
								if( Money_Flow_Ratio > 0.213784 )
									ret := -0.193909
						if( Negative_Money_Flow > 1.87812e+08 )
							if( VIP <= 1.06048 )
								if( MFI <= 8.91256 )
									ret := -0.228571
								if( MFI > 8.91256 )
									ret := 0.368421
							if( VIP > 1.06048 )
								if( Raw_Money_Flow <= 1.54153e+09 )
									ret := -0.181818
								if( Raw_Money_Flow > 1.54153e+09 )
									ret := -0.733333 // sell
				if( MFI_Low > 8.15752 )
					if( MFI_Low <= 10.7496 )
						if( Positive_Money_Flow <= 1.83725e+08 )
							if( Raw_Money_Flow <= 5.2174e+07 )
								if( Positive_Money_Flow_Sum <= 9.23124e+08 )
									ret := 0.077720
								if( Positive_Money_Flow_Sum > 9.23124e+08 )
									ret := -0.785714 // sell
							if( Raw_Money_Flow > 5.2174e+07 )
								if( Positive_Money_Flow_Sum <= 2.61472e+08 )
									ret := 0.632353
								if( Positive_Money_Flow_Sum > 2.61472e+08 )
									ret := 0.270106
						if( Positive_Money_Flow > 1.83725e+08 )
							ret := -0.722222 // sell
					if( MFI_Low > 10.7496 )
						if( Raw_Money_Flow <= 4.91236e+07 )
							if( VIP <= 1.16531 )
								if( VIM <= 1.22777 )
									ret := -0.131206
								if( VIM > 1.22777 )
									ret := -0.709677 // sell
							if( VIP > 1.16531 )
								if( Negative_Money_Flow <= 809054 )
									ret := -0.264151
								if( Negative_Money_Flow > 809054 )
									ret := -0.925926 // sell
						if( Raw_Money_Flow > 4.91236e+07 )
							if( VIP_VIM <= -0.446013 )
								if( Typical_Price <= 305.984 )
									ret := -0.789474 // sell
								if( Typical_Price > 305.984 )
									ret := -0.127341
							if( VIP_VIM > -0.446013 )
								if( Negative_Money_Flow_Sum <= 5.89816e+08 )
									ret := -0.569231
								if( Negative_Money_Flow_Sum > 5.89816e+08 )
									ret := 0.133333
			if( Positive_Money_Flow_Sum > 1.18068e+09 )
				if( VIP_VIM <= -0.406226 )
					if( MFI <= 26.2281 )
						ret := 0.600000
					if( MFI > 26.2281 )
						ret := 0.300000
				if( VIP_VIM > -0.406226 )
					if( Typical_Price <= 336.523 )
						if( MFI_Low <= 7.69361 )
							ret := 0.500000
						if( MFI_Low > 7.69361 )
							ret := 0.928571 // buy
					if( Typical_Price > 336.523 )
						if( Money_Flow_Ratio <= 0.204879 )
							ret := 0.307692
						if( Money_Flow_Ratio > 0.204879 )
							if( VIM <= 1.18862 )
								if( VIP <= 1.0205 )
									ret := -0.805031 // sell
								if( VIP > 1.0205 )
									ret := -0.272727
							if( VIM > 1.18862 )
								ret := -0.076923
	if( Money_Flow_Ratio > 0.582213 )
		if( Negative_Money_Flow <= 38438.8 )
			if( Positive_Money_Flow <= 2.41129e+07 )
				if( Money_Flow_Ratio <= 0.829534 )
					if( VIM <= 1.04575 )
						if( Negative_Money_Flow_Sum <= 2.54589e+08 )
							if( VIP_VIM <= 0.533327 )
								if( Positive_Money_Flow <= 9.57491e+06 )
									ret := -0.114804
								if( Positive_Money_Flow > 9.57491e+06 )
									ret := -0.626667
							if( VIP_VIM > 0.533327 )
								ret := 0.318182
						if( Negative_Money_Flow_Sum > 2.54589e+08 )
							if( Typical_Price <= 331.752 )
								ret := -0.157895
							if( Typical_Price > 331.752 )
								if( VIP <= 1.22632 )
									ret := 0.444444
								if( VIP > 1.22632 )
									ret := -0.083333
					if( VIM > 1.04575 )
						if( Negative_Money_Flow_Sum <= 4.42128e+06 )
							if( MFI <= 43.4916 )
								if( Positive_Money_Flow_Sum <= 2.66806e+06 )
									ret := 0.039301
								if( Positive_Money_Flow_Sum > 2.66806e+06 )
									ret := -0.651685
							if( MFI > 43.4916 )
								if( Negative_Money_Flow_Sum <= 2.45048e+06 )
									ret := 0.387097
								if( Negative_Money_Flow_Sum > 2.45048e+06 )
									ret := -0.058824
						if( Negative_Money_Flow_Sum > 4.42128e+06 )
							if( Raw_Money_Flow <= 6.8689e+06 )
								if( Raw_Money_Flow <= 1.767e+06 )
									ret := 0.110945
								if( Raw_Money_Flow > 1.767e+06 )
									ret := 0.385666
							if( Raw_Money_Flow > 6.8689e+06 )
								if( Negative_Money_Flow_Sum <= 2.96058e+08 )
									ret := -0.346774
								if( Negative_Money_Flow_Sum > 2.96058e+08 )
									ret := 0.625000
				if( Money_Flow_Ratio > 0.829534 )
					if( Typical_Price <= 434 )
						if( VIM <= 1.29014 )
							if( Raw_Money_Flow <= 2.31018e+06 )
								if( VIP_VIM <= 0.730301 )
									ret := -0.044733
								if( VIP_VIM > 0.730301 )
									ret := -0.245669
							if( Raw_Money_Flow > 2.31018e+06 )
								if( Positive_Money_Flow_Sum <= 9.12832e+06 )
									ret := 0.006757
								if( Positive_Money_Flow_Sum > 9.12832e+06 )
									ret := -0.228562
						if( VIM > 1.29014 )
							if( MFI <= 97.8383 )
								if( Positive_Money_Flow <= 4.8901e+06 )
									ret := -0.034025
								if( Positive_Money_Flow > 4.8901e+06 )
									ret := -0.666667
							if( MFI > 97.8383 )
								if( VIP <= 1.81288 )
									ret := -0.240000
								if( VIP > 1.81288 )
									ret := 0.685185
					if( Typical_Price > 434 )
						if( Positive_Money_Flow <= 2.13567e+06 )
							if( MFI_Low <= 46.4539 )
								if( Negative_Money_Flow_Sum <= 3.82586e+06 )
									ret := -0.235772
								if( Negative_Money_Flow_Sum > 3.82586e+06 )
									ret := -0.491525
							if( MFI_Low > 46.4539 )
								if( Positive_Money_Flow <= 143617 )
									ret := -0.162791
								if( Positive_Money_Flow > 143617 )
									ret := 0.150000
						if( Positive_Money_Flow > 2.13567e+06 )
							if( Raw_Money_Flow <= 1.88743e+07 )
								if( Negative_Money_Flow_Sum <= 2.22739e+07 )
									ret := -0.732283 // sell
								if( Negative_Money_Flow_Sum > 2.22739e+07 )
									ret := -0.319149
							if( Raw_Money_Flow > 1.88743e+07 )
								ret := 0.100000
			if( Positive_Money_Flow > 2.41129e+07 )
				if( VIP <= 0.913737 )
					if( Negative_Money_Flow_Sum <= 4.99759e+08 )
						if( VIM <= 1.12813 )
							if( MFI_Low <= 70.6605 )
								if( VIP <= 0.805591 )
									ret := -0.700000 // sell
								if( VIP > 0.805591 )
									ret := -0.183028
							if( MFI_Low > 70.6605 )
								if( Positive_Money_Flow <= 3.32106e+08 )
									ret := -0.086957
								if( Positive_Money_Flow > 3.32106e+08 )
									ret := 0.544118
						if( VIM > 1.12813 )
							if( Negative_Money_Flow_Sum <= 2.18856e+08 )
								if( VIM <= 1.15732 )
									ret := -0.789474 // sell
								if( VIM > 1.15732 )
									ret := -0.166667
							if( Negative_Money_Flow_Sum > 2.18856e+08 )
								if( VIP <= 0.821779 )
									ret := -0.133929
								if( VIP > 0.821779 )
									ret := 0.163690
					if( Negative_Money_Flow_Sum > 4.99759e+08 )
						if( Raw_Money_Flow <= 2.13395e+08 )
							if( VIP_VIM <= -0.289585 )
								if( MFI <= 53.6568 )
									ret := -0.518337
								if( MFI > 53.6568 )
									ret := 0.090909
							if( VIP_VIM > -0.289585 )
								if( Negative_Money_Flow_Sum <= 6.89875e+08 )
									ret := -0.399361
								if( Negative_Money_Flow_Sum > 6.89875e+08 )
									ret := -0.131579
						if( Raw_Money_Flow > 2.13395e+08 )
							if( Typical_Price <= 372.883 )
								if( MFI_Low <= 45.7756 )
									ret := 0.659091
								if( MFI_Low > 45.7756 )
									ret := -0.375000
							if( Typical_Price > 372.883 )
								if( MFI <= 46.7105 )
									ret := 0.300000
								if( MFI > 46.7105 )
									ret := -0.500000
				if( VIP > 0.913737 )
					if( Negative_Money_Flow_Sum <= 4.10741e+08 )
						if( MFI <= 72.8359 )
							if( Positive_Money_Flow_Sum <= 2.44173e+08 )
								if( Money_Flow_Ratio <= 0.654583 )
									ret := 0.288889
								if( Money_Flow_Ratio > 0.654583 )
									ret := -0.147793
							if( Positive_Money_Flow_Sum > 2.44173e+08 )
								if( MFI <= 55.7253 )
									ret := 0.150785
								if( MFI > 55.7253 )
									ret := 0.049445
						if( MFI > 72.8359 )
							if( Negative_Money_Flow_Sum <= 2.73418e+07 )
								if( Money_Flow_Ratio <= 82.5887 )
									ret := 0.161616
								if( Money_Flow_Ratio > 82.5887 )
									ret := -0.301205
							if( Negative_Money_Flow_Sum > 2.73418e+07 )
								if( VIP_VIM <= 0.484087 )
									ret := -0.169697
								if( VIP_VIM > 0.484087 )
									ret := 0.030702
					if( Negative_Money_Flow_Sum > 4.10741e+08 )
						if( Money_Flow_Ratio <= 0.720118 )
							if( VIM <= 1.05861 )
								if( MFI <= 40.6658 )
									ret := 0.208955
								if( MFI > 40.6658 )
									ret := 0.563492
							if( VIM > 1.05861 )
								if( Negative_Money_Flow_Sum <= 9.40862e+08 )
									ret := -0.275109
								if( Negative_Money_Flow_Sum > 9.40862e+08 )
									ret := 0.365854
						if( Money_Flow_Ratio > 0.720118 )
							if( VIP_VIM <= 0.457933 )
								if( Positive_Money_Flow_Sum <= 1.37574e+09 )
									ret := -0.140872
								if( Positive_Money_Flow_Sum > 1.37574e+09 )
									ret := 0.072897
							if( VIP_VIM > 0.457933 )
								if( MFI <= 71.6644 )
									ret := -0.225000
								if( MFI > 71.6644 )
									ret := -0.497297
		if( Negative_Money_Flow > 38438.8 )
			if( Negative_Money_Flow <= 721461 )
				if( VIP_VIM <= 1.05021 )
					if( VIM <= 37.2176 )
						if( Positive_Money_Flow_Sum <= 1.23797e+06 )
							if( MFI_High <= -39.7424 )
								ret := 0.153846
							if( MFI_High > -39.7424 )
								if( Negative_Money_Flow <= 246424 )
									ret := 0.620690
								if( Negative_Money_Flow > 246424 )
									ret := 0.960000 // buy
						if( Positive_Money_Flow_Sum > 1.23797e+06 )
							if( Typical_Price <= 412.968 )
								if( VIM <= 1.03415 )
									ret := -0.016393
								if( VIM > 1.03415 )
									ret := 0.123201
							if( Typical_Price > 412.968 )
								if( MFI <= 61.1897 )
									ret := -0.108559
								if( MFI > 61.1897 )
									ret := 0.119540
					if( VIM > 37.2176 )
						ret := -0.900000 // sell
				if( VIP_VIM > 1.05021 )
					if( MFI_High <= -19.6605 )
						if( VIM <= 2.59617 )
							if( Negative_Money_Flow <= 205350 )
								if( Negative_Money_Flow_Sum <= 2.78081e+06 )
									ret := -0.964286 // sell
								if( Negative_Money_Flow_Sum > 2.78081e+06 )
									ret := -0.727273 // sell
							if( Negative_Money_Flow > 205350 )
								if( VIP_VIM <= 1.15663 )
									ret := -0.916667 // sell
								if( VIP_VIM > 1.15663 )
									ret := -0.187500
						if( VIM > 2.59617 )
							ret := 0.187500
					if( MFI_High > -19.6605 )
						if( MFI_High <= -5.60392 )
							if( Negative_Money_Flow_Sum <= 809758 )
								ret := 0.857143 // buy
							if( Negative_Money_Flow_Sum > 809758 )
								if( VIP_VIM <= 1.07742 )
									ret := -0.500000
								if( VIP_VIM > 1.07742 )
									ret := 0.262500
						if( MFI_High > -5.60392 )
							if( Raw_Money_Flow <= 285367 )
								if( Raw_Money_Flow <= 137609 )
									ret := -0.242424
								if( Raw_Money_Flow > 137609 )
									ret := -0.586957
							if( Raw_Money_Flow > 285367 )
								if( Positive_Money_Flow_Sum <= 9.33352e+06 )
									ret := -0.093750
								if( Positive_Money_Flow_Sum > 9.33352e+06 )
									ret := 0.272727
			if( Negative_Money_Flow > 721461 )
				if( Negative_Money_Flow_Sum <= 1.54657e+09 )
					if( Raw_Money_Flow <= 1.83936e+08 )
						if( Positive_Money_Flow_Sum <= 3.19446e+06 )
							if( Raw_Money_Flow <= 1.30578e+06 )
								if( MFI_Low <= 18.6662 )
									ret := -0.826087 // sell
								if( MFI_Low > 18.6662 )
									ret := -0.363636
							if( Raw_Money_Flow > 1.30578e+06 )
								if( MFI_High <= -36.9907 )
									ret := -0.214286
								if( MFI_High > -36.9907 )
									ret := 0.400000
						if( Positive_Money_Flow_Sum > 3.19446e+06 )
							if( VIP <= 0.905777 )
								if( Raw_Money_Flow <= 4.01688e+07 )
									ret := 0.044492
								if( Raw_Money_Flow > 4.01688e+07 )
									ret := -0.162664
							if( VIP > 0.905777 )
								if( Negative_Money_Flow_Sum <= 5.65724e+08 )
									ret := -0.010484
								if( Negative_Money_Flow_Sum > 5.65724e+08 )
									ret := 0.116065
					if( Raw_Money_Flow > 1.83936e+08 )
						if( Money_Flow_Ratio <= 2.56482 )
							if( VIM <= 1.0633 )
								if( VIM <= 0.877822 )
									ret := -0.485714
								if( VIM > 0.877822 )
									ret := 0.017391
							if( VIM > 1.0633 )
								if( MFI_Low <= 21.9252 )
									ret := -0.177778
								if( MFI_Low > 21.9252 )
									ret := -0.794872 // sell
						if( Money_Flow_Ratio > 2.56482 )
							if( Negative_Money_Flow <= 4.06562e+08 )
								if( VIP_VIM <= 0.398512 )
									ret := 0.490566
								if( VIP_VIM > 0.398512 )
									ret := -0.045455
							if( Negative_Money_Flow > 4.06562e+08 )
								ret := -0.538462
				if( Negative_Money_Flow_Sum > 1.54657e+09 )
					if( Negative_Money_Flow_Sum <= 1.66238e+09 )
						if( MFI <= 59.5989 )
							if( Raw_Money_Flow <= 1.5478e+08 )
								if( MFI_Low <= 34.9062 )
									ret := 0.935484 // buy
								if( MFI_Low > 34.9062 )
									ret := 0.636364
							if( Raw_Money_Flow > 1.5478e+08 )
								ret := -0.187500
						if( MFI > 59.5989 )
							ret := -0.100000
					if( Negative_Money_Flow_Sum > 1.66238e+09 )
						if( Positive_Money_Flow_Sum <= 4.11061e+09 )
							if( Positive_Money_Flow_Sum <= 3.92875e+09 )
								if( VIP <= 1.13614 )
									ret := -0.084112
								if( VIP > 1.13614 )
									ret := 0.545455
							if( Positive_Money_Flow_Sum > 3.92875e+09 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 4.11061e+09 )
							ret := 0.764706 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_MSFT_5Min_75b7fd1b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


