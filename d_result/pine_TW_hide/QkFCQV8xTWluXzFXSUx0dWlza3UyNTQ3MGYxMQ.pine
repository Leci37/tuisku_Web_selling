//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: BABA_1Min_1WIL_25470f11 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_1Min_1WIL_25470f11", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_1Min_25470f11(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Color_con1 <= 0.00826 )
		if( upperBand <= 0.259833 )
			if( wvf <= 0.050066 )
				if( Color_con1 <= -0.139013 )
					if( Color_con2 <= -0.067359 )
						if( Color_con2 <= -1.70142 )
							if( Color_con2 <= -2.09095 )
								if( Color_con2 <= -2.36573 )
									ret := -0.250000
								if( Color_con2 > -2.36573 )
									ret := 0.000000
							if( Color_con2 > -2.09095 )
								ret := 1.000000 // buy
						if( Color_con2 > -1.70142 )
							if( wvf <= 0.024553 )
								if( Color_con1 <= -0.255844 )
									ret := -0.789474 // sell
								if( Color_con1 > -0.255844 )
									ret := -0.189157
							if( wvf > 0.024553 )
								if( midLine <= 0.087043 )
									ret := 0.046256
								if( midLine > 0.087043 )
									ret := -0.151929
					if( Color_con2 > -0.067359 )
						if( lowerBand <= -0.037836 )
							if( Color_con1 <= -0.147622 )
								ret := 0.000000
							if( Color_con1 > -0.147622 )
								ret := 0.166667
						if( lowerBand > -0.037836 )
							if( midLine <= 0.08166 )
								ret := 1.000000 // buy
							if( midLine > 0.08166 )
								ret := 0.500000
				if( Color_con1 > -0.139013 )
					if( upperBand <= 0.073988 )
						if( lowerBand <= -0.021306 )
							if( midLine <= 0.022414 )
								if( Color_con2 <= -0.071669 )
									ret := 0.276316
								if( Color_con2 > -0.071669 )
									ret := 0.779070 // buy
							if( midLine > 0.022414 )
								if( Color_con2 <= -0.178141 )
									ret := -0.571429
								if( Color_con2 > -0.178141 )
									ret := 0.200000
						if( lowerBand > -0.021306 )
							if( lowerBand <= -0.007817 )
								if( Color_con2 <= -0.219619 )
									ret := -0.440678
								if( Color_con2 > -0.219619 )
									ret := -0.046875
							if( lowerBand > -0.007817 )
								if( midLine <= 0.035462 )
									ret := 0.286472
								if( midLine > 0.035462 )
									ret := -0.057143
					if( upperBand > 0.073988 )
						if( midLine <= 0.058576 )
							if( Color_con2 <= -0.277014 )
								if( Color_con2 <= -0.403317 )
									ret := -0.175676
								if( Color_con2 > -0.403317 )
									ret := 0.304348
							if( Color_con2 > -0.277014 )
								if( lowerBand <= -0.058793 )
									ret := -0.492754
								if( lowerBand > -0.058793 )
									ret := -0.107366
						if( midLine > 0.058576 )
							if( midLine <= 0.080522 )
								if( Color_con1 <= -0.095518 )
									ret := 0.148825
								if( Color_con1 > -0.095518 )
									ret := 0.011494
							if( midLine > 0.080522 )
								if( upperBand <= 0.171634 )
									ret := -0.118841
								if( upperBand > 0.171634 )
									ret := 0.277108
			if( wvf > 0.050066 )
				if( sDev <= 0.08317 )
					if( upperBand <= 0.12951 )
						if( sDev <= 0.042324 )
							if( lowerBand <= -0.01378 )
								if( wvf <= 0.05172 )
									ret := -0.200000
								if( wvf > 0.05172 )
									ret := -0.777778 // sell
							if( lowerBand > -0.01378 )
								if( Color_con1 <= -0.057322 )
									ret := 0.736842 // buy
								if( Color_con1 > -0.057322 )
									ret := -0.103448
						if( sDev > 0.042324 )
							if( sDev <= 0.063918 )
								if( Color_con2 <= 0.002067 )
									ret := 0.083130
								if( Color_con2 > 0.002067 )
									ret := -0.152542
							if( sDev > 0.063918 )
								if( lowerBand <= -0.032168 )
									ret := 0.141732
								if( lowerBand > -0.032168 )
									ret := -0.133005
					if( upperBand > 0.12951 )
						if( Color_con2 <= -1.15347 )
							if( upperBand <= 0.18608 )
								if( midLine <= 0.109637 )
									ret := -0.181818
								if( midLine > 0.109637 )
									ret := 1.000000 // buy
							if( upperBand > 0.18608 )
								if( sDev <= 0.081573 )
									ret := -0.956522 // sell
								if( sDev > 0.081573 )
									ret := -0.500000
						if( Color_con2 > -1.15347 )
							if( Color_con2 <= -0.343975 )
								if( sDev <= 0.0681 )
									ret := 0.086331
								if( sDev > 0.0681 )
									ret := 0.370607
							if( Color_con2 > -0.343975 )
								if( wvf <= 0.052547 )
									ret := -0.237705
								if( wvf > 0.052547 )
									ret := 0.089283
				if( sDev > 0.08317 )
					if( midLine <= 0.070542 )
						if( wvf <= 0.105194 )
							if( wvf <= 0.084546 )
								if( Color_con1 <= -0.129949 )
									ret := 0.465517
								if( Color_con1 > -0.129949 )
									ret := 0.059590
							if( wvf > 0.084546 )
								if( upperBand <= 0.162084 )
									ret := -0.307317
								if( upperBand > 0.162084 )
									ret := -0.057471
						if( wvf > 0.105194 )
							if( upperBand <= 0.1389 )
								if( lowerBand <= -0.060328 )
									ret := -1.000000 // sell
								if( lowerBand > -0.060328 )
									ret := 0.021277
							if( upperBand > 0.1389 )
								if( lowerBand <= -0.047984 )
									ret := 0.392000
								if( lowerBand > -0.047984 )
									ret := 0.229213
					if( midLine > 0.070542 )
						if( Color_con2 <= -2.00127 )
							if( sDev <= 0.100691 )
								if( sDev <= 0.09752 )
									ret := 0.250000
								if( sDev > 0.09752 )
									ret := -0.333333
							if( sDev > 0.100691 )
								if( Color_con1 <= -0.114611 )
									ret := -0.250000
								if( Color_con1 > -0.114611 )
									ret := 0.767442 // buy
						if( Color_con2 > -2.00127 )
							if( lowerBand <= 0.023235 )
								if( midLine <= 0.108965 )
									ret := -0.005056
								if( midLine > 0.108965 )
									ret := -0.109943
							if( lowerBand > 0.023235 )
								if( Color_con2 <= -0.157852 )
									ret := 0.205224
								if( Color_con2 > -0.157852 )
									ret := 0.020266
		if( upperBand > 0.259833 )
			if( wvf <= 3.61157 )
				if( wvf <= 2.02529 )
					if( wvf <= 1.72114 )
						if( Color_con1 <= -4.90355 )
							if( Color_con2 <= -2.87637 )
								if( Color_con1 <= -14.6291 )
									ret := -0.500000
								if( Color_con1 > -14.6291 )
									ret := 0.779070 // buy
							if( Color_con2 > -2.87637 )
								ret := -1.000000 // sell
						if( Color_con1 > -4.90355 )
							if( wvf <= 0.614865 )
								if( midLine <= 0.603123 )
									ret := 0.056906
								if( midLine > 0.603123 )
									ret := -0.077228
							if( wvf > 0.614865 )
								if( lowerBand <= 0.177879 )
									ret := 0.046718
								if( lowerBand > 0.177879 )
									ret := 0.214036
					if( wvf > 1.72114 )
						if( Color_con2 <= 0.284451 )
							if( Color_con1 <= -0.357676 )
								if( sDev <= 1.6029 )
									ret := 0.181818
								if( sDev > 1.6029 )
									ret := 0.833333 // buy
							if( Color_con1 > -0.357676 )
								if( sDev <= 0.724377 )
									ret := 0.200000
								if( sDev > 0.724377 )
									ret := -0.923077 // sell
						if( Color_con2 > 0.284451 )
							if( lowerBand <= -1.11787 )
								if( midLine <= 0.587688 )
									ret := -0.800000 // sell
								if( midLine > 0.587688 )
									ret := 1.000000 // buy
							if( lowerBand > -1.11787 )
								if( upperBand <= 2.29044 )
									ret := 0.948718 // buy
								if( upperBand > 2.29044 )
									ret := 0.300000
				if( wvf > 2.02529 )
					if( sDev <= 1.32608 )
						if( Color_con2 <= -0.078394 )
							if( Color_con2 <= -1.35571 )
								ret := 1.000000 // buy
							if( Color_con2 > -1.35571 )
								if( wvf <= 3.5048 )
									ret := -0.536585
								if( wvf > 3.5048 )
									ret := 0.666667
						if( Color_con2 > -0.078394 )
							if( wvf <= 2.07778 )
								if( lowerBand <= 0.715738 )
									ret := -1.000000 // sell
								if( lowerBand > 0.715738 )
									ret := 0.000000
							if( wvf > 2.07778 )
								if( upperBand <= 2.54663 )
									ret := 0.310345
								if( upperBand > 2.54663 )
									ret := 0.848485 // buy
					if( sDev > 1.32608 )
						if( Color_con1 <= -2.25598 )
							if( lowerBand <= -1.2271 )
								if( Color_con1 <= -2.32495 )
									ret := -0.250000
								if( Color_con1 > -2.32495 )
									ret := -1.000000 // sell
							if( lowerBand > -1.2271 )
								ret := -1.000000 // sell
						if( Color_con1 > -2.25598 )
							if( wvf <= 2.37175 )
								if( Color_con2 <= -0.126228 )
									ret := 0.333333
								if( Color_con2 > -0.126228 )
									ret := -0.568966
							if( wvf > 2.37175 )
								if( sDev <= 2.03769 )
									ret := -0.522388
								if( sDev > 2.03769 )
									ret := 0.395062
			if( wvf > 3.61157 )
				if( Color_con1 <= -5.05949 )
					if( wvf <= 9.44446 )
						ret := -1.000000 // sell
					if( wvf > 9.44446 )
						ret := 0.500000
				if( Color_con1 > -5.05949 )
					if( Color_con1 <= -0.146704 )
						if( sDev <= 3.46246 )
							if( midLine <= 3.07628 )
								if( Color_con2 <= 0.310541 )
									ret := 1.000000 // buy
								if( Color_con2 > 0.310541 )
									ret := 0.400000
							if( midLine > 3.07628 )
								if( wvf <= 3.68301 )
									ret := 0.500000
								if( wvf > 3.68301 )
									ret := -0.500000
						if( sDev > 3.46246 )
							if( Color_con2 <= 0.038529 )
								if( sDev <= 3.83689 )
									ret := 0.500000
								if( sDev > 3.83689 )
									ret := 1.000000 // buy
							if( Color_con2 > 0.038529 )
								if( lowerBand <= -5.54489 )
									ret := 0.750000 // buy
								if( lowerBand > -5.54489 )
									ret := 1.000000 // buy
					if( Color_con1 > -0.146704 )
						ret := 0.000000
	if( Color_con1 > 0.00826 )
		if( Color_con1 <= 0.117632 )
			if( Color_con2 <= 0.038261 )
				if( sDev <= 0.187428 )
					if( Color_con1 <= 0.020115 )
						if( sDev <= 0.084692 )
							if( lowerBand <= 0.046012 )
								if( wvf <= 0.09684 )
									ret := 0.304348
								if( wvf > 0.09684 )
									ret := -0.109589
							if( lowerBand > 0.046012 )
								if( Color_con2 <= -0.207757 )
									ret := -1.000000 // sell
								if( Color_con2 > -0.207757 )
									ret := -0.400000
						if( sDev > 0.084692 )
							if( wvf <= 0.170361 )
								if( Color_con2 <= 0.019956 )
									ret := 0.965517 // buy
								if( Color_con2 > 0.019956 )
									ret := 0.166667
							if( wvf > 0.170361 )
								if( midLine <= 0.065811 )
									ret := -0.645161
								if( midLine > 0.065811 )
									ret := 0.193916
					if( Color_con1 > 0.020115 )
						if( Color_con2 <= -0.303628 )
							if( midLine <= 0.166779 )
								if( midLine <= 0.041147 )
									ret := -0.333333
								if( midLine > 0.041147 )
									ret := 0.808511 // buy
							if( midLine > 0.166779 )
								if( Color_con1 <= 0.037111 )
									ret := 0.625000
								if( Color_con1 > 0.037111 )
									ret := -0.700000 // sell
						if( Color_con2 > -0.303628 )
							if( Color_con2 <= -0.215979 )
								if( Color_con2 <= -0.247664 )
									ret := 0.181818
								if( Color_con2 > -0.247664 )
									ret := -0.684211
							if( Color_con2 > -0.215979 )
								if( midLine <= 0.096825 )
									ret := 0.340045
								if( midLine > 0.096825 )
									ret := 0.068670
				if( sDev > 0.187428 )
					if( Color_con1 <= 0.032086 )
						if( lowerBand <= -0.089765 )
							if( Color_con1 <= 0.011265 )
								ret := 0.400000
							if( Color_con1 > 0.011265 )
								if( midLine <= 0.161121 )
									ret := 0.000000
								if( midLine > 0.161121 )
									ret := -0.941176 // sell
						if( lowerBand > -0.089765 )
							if( sDev <= 0.193036 )
								if( Color_con2 <= -0.169775 )
									ret := -0.250000
								if( Color_con2 > -0.169775 )
									ret := -0.666667
							if( sDev > 0.193036 )
								if( Color_con2 <= -0.286289 )
									ret := 0.650000
								if( Color_con2 > -0.286289 )
									ret := 0.229730
					if( Color_con1 > 0.032086 )
						if( Color_con2 <= -0.738257 )
							if( lowerBand <= -0.016415 )
								if( midLine <= 0.189781 )
									ret := 1.000000 // buy
								if( midLine > 0.189781 )
									ret := 0.750000 // buy
							if( lowerBand > -0.016415 )
								ret := -0.333333
						if( Color_con2 > -0.738257 )
							if( lowerBand <= -0.216771 )
								ret := 1.000000 // buy
							if( lowerBand > -0.216771 )
								if( upperBand <= 0.333482 )
									ret := 0.500000
								if( upperBand > 0.333482 )
									ret := -0.561290
			if( Color_con2 > 0.038261 )
				if( wvf <= 0.379478 )
					if( wvf <= 0.360123 )
						if( Color_con2 <= 0.094227 )
							if( wvf <= 0.183158 )
								if( Color_con2 <= 0.065474 )
									ret := -0.173228
								if( Color_con2 > 0.065474 )
									ret := 0.287129
							if( wvf > 0.183158 )
								if( lowerBand <= -0.051485 )
									ret := 0.702703 // buy
								if( lowerBand > -0.051485 )
									ret := 0.352217
						if( Color_con2 > 0.094227 )
							if( Color_con2 <= 0.127487 )
								if( sDev <= 0.123162 )
									ret := 0.093567
								if( sDev > 0.123162 )
									ret := -0.248408
							if( Color_con2 > 0.127487 )
								if( lowerBand <= -0.071735 )
									ret := 0.500000
								if( lowerBand > -0.071735 )
									ret := 0.150502
					if( wvf > 0.360123 )
						if( Color_con2 <= 0.134362 )
							if( Color_con1 <= 0.02184 )
								if( midLine <= 0.22678 )
									ret := -0.583333
								if( midLine > 0.22678 )
									ret := 0.800000 // buy
							if( Color_con1 > 0.02184 )
								if( sDev <= 0.118354 )
									ret := -0.250000
								if( sDev > 0.118354 )
									ret := 0.735294 // buy
						if( Color_con2 > 0.134362 )
							if( Color_con2 <= 0.234787 )
								if( upperBand <= 0.283205 )
									ret := 0.111111
								if( upperBand > 0.283205 )
									ret := -0.616438
							if( Color_con2 > 0.234787 )
								if( wvf <= 0.365177 )
									ret := 0.333333
								if( wvf > 0.365177 )
									ret := 1.000000 // buy
				if( wvf > 0.379478 )
					if( midLine <= 0.372513 )
						if( Color_con2 <= 0.113043 )
							if( midLine <= 0.145585 )
								if( Color_con1 <= 0.065475 )
									ret := -0.625000
								if( Color_con1 > 0.065475 )
									ret := 0.666667
							if( midLine > 0.145585 )
								if( Color_con1 <= 0.099134 )
									ret := 0.743421 // buy
								if( Color_con1 > 0.099134 )
									ret := -0.500000
						if( Color_con2 > 0.113043 )
							if( midLine <= 0.281553 )
								if( upperBand <= 0.343791 )
									ret := 0.608696
								if( upperBand > 0.343791 )
									ret := 0.224972
							if( midLine > 0.281553 )
								if( Color_con1 <= 0.024834 )
									ret := 0.237288
								if( Color_con1 > 0.024834 )
									ret := 0.642487
					if( midLine > 0.372513 )
						if( midLine <= 0.525512 )
							if( Color_con2 <= 0.948431 )
								if( lowerBand <= 0.055745 )
									ret := -0.382979
								if( lowerBand > 0.055745 )
									ret := 0.116279
							if( Color_con2 > 0.948431 )
								if( sDev <= 1.25501 )
									ret := 1.000000 // buy
								if( sDev > 1.25501 )
									ret := -0.200000
						if( midLine > 0.525512 )
							if( Color_con1 <= 0.019482 )
								if( upperBand <= 0.936294 )
									ret := 0.600000
								if( upperBand > 0.936294 )
									ret := -0.428571
							if( Color_con1 > 0.019482 )
								if( sDev <= 0.306204 )
									ret := -0.230769
								if( sDev > 0.306204 )
									ret := 0.631579
		if( Color_con1 > 0.117632 )
			if( Color_con2 <= 0.314251 )
				if( sDev <= 0.200853 )
					if( wvf <= 0.401791 )
						if( midLine <= 0.052136 )
							ret := 0.750000 // buy
						if( midLine > 0.052136 )
							if( Color_con2 <= 0.200408 )
								if( Color_con1 <= 0.125843 )
									ret := -1.000000 // sell
								if( Color_con1 > 0.125843 )
									ret := -0.750000 // sell
							if( Color_con2 > 0.200408 )
								if( Color_con2 <= 0.25997 )
									ret := 0.250000
								if( Color_con2 > 0.25997 )
									ret := -0.571429
					if( wvf > 0.401791 )
						if( Color_con2 <= 0.256979 )
							if( Color_con2 <= 0.242836 )
								if( Color_con2 <= 0.055161 )
									ret := 0.900000 // buy
								if( Color_con2 > 0.055161 )
									ret := 0.300000
							if( Color_con2 > 0.242836 )
								ret := 1.000000 // buy
						if( Color_con2 > 0.256979 )
							if( wvf <= 0.439993 )
								ret := 0.333333
							if( wvf > 0.439993 )
								ret := -0.666667
				if( sDev > 0.200853 )
					if( Color_con2 <= -0.55385 )
						if( sDev <= 0.477398 )
							ret := 1.000000 // buy
						if( sDev > 0.477398 )
							ret := 0.500000
					if( Color_con2 > -0.55385 )
						if( lowerBand <= -0.208367 )
							if( Color_con1 <= 0.178001 )
								ret := -0.250000
							if( Color_con1 > 0.178001 )
								ret := 1.000000 // buy
						if( lowerBand > -0.208367 )
							if( lowerBand <= 0.040663 )
								if( upperBand <= 0.645898 )
									ret := -0.543689
								if( upperBand > 0.645898 )
									ret := 0.333333
							if( lowerBand > 0.040663 )
								ret := -1.000000 // sell
			if( Color_con2 > 0.314251 )
				if( Color_con1 <= 0.901278 )
					if( wvf <= 1.46126 )
						if( Color_con1 <= 0.390403 )
							if( sDev <= 0.671238 )
								if( upperBand <= 0.891638 )
									ret := 0.124424
								if( upperBand > 0.891638 )
									ret := 0.771930 // buy
							if( sDev > 0.671238 )
								if( upperBand <= 0.928961 )
									ret := 0.571429
								if( upperBand > 0.928961 )
									ret := -0.508772
						if( Color_con1 > 0.390403 )
							if( lowerBand <= -0.186733 )
								if( Color_con1 <= 0.599362 )
									ret := -0.596491
								if( Color_con1 > 0.599362 )
									ret := 0.285714
							if( lowerBand > -0.186733 )
								ret := 0.500000
					if( wvf > 1.46126 )
						if( Color_con2 <= 1.15614 )
							if( lowerBand <= 0.189493 )
								if( Color_con2 <= 0.581692 )
									ret := 0.250000
								if( Color_con2 > 0.581692 )
									ret := 0.973684 // buy
							if( lowerBand > 0.189493 )
								ret := -0.400000
						if( Color_con2 > 1.15614 )
							if( midLine <= 0.481753 )
								if( lowerBand <= -0.452644 )
									ret := 0.431818
								if( lowerBand > -0.452644 )
									ret := -0.666667
							if( midLine > 0.481753 )
								if( lowerBand <= -1.87747 )
									ret := 1.000000 // buy
								if( lowerBand > -1.87747 )
									ret := -0.517241
				if( Color_con1 > 0.901278 )
					if( midLine <= 0.189727 )
						if( Color_con2 <= 2.39547 )
							ret := 0.750000 // buy
						if( Color_con2 > 2.39547 )
							ret := 1.000000 // buy
					if( midLine > 0.189727 )
						if( midLine <= 0.646475 )
							if( Color_con1 <= 1.3813 )
								if( midLine <= 0.238973 )
									ret := -0.928571 // sell
								if( midLine > 0.238973 )
									ret := -0.700000 // sell
							if( Color_con1 > 1.3813 )
								if( midLine <= 0.395121 )
									ret := -0.692308
								if( midLine > 0.395121 )
									ret := 0.300000
						if( midLine > 0.646475 )
							if( upperBand <= 4.73474 )
								ret := 1.000000 // buy
							if( upperBand > 4.73474 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_BABA_1Min_25470f11(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


