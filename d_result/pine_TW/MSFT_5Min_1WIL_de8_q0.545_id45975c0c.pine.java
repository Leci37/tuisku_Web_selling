//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: MSFT_5Min_1WIL_45975c0c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1WIL_45975c0c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_45975c0c(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lowerBand <= 0.334718 )
		if( Color_con1 <= 0.00913 )
			if( Color_con1 <= -1.46415 )
				if( sDev <= 1.15863 )
					if( upperBand <= 2.11669 )
						if( wvf <= 0.391714 )
							if( sDev <= 0.99055 )
								if( Color_con1 <= -1.51581 )
									ret := 0.005714
								if( Color_con1 > -1.51581 )
									ret := 0.515789
							if( sDev > 0.99055 )
								if( lowerBand <= -0.440316 )
									ret := -0.117647
								if( lowerBand > -0.440316 )
									ret := 0.540816
						if( wvf > 0.391714 )
							if( Color_con1 <= -1.61512 )
								ret := -1.000000 // sell
							if( Color_con1 > -1.61512 )
								if( sDev <= 0.930951 )
									ret := 0.411765
								if( sDev > 0.930951 )
									ret := -0.476190
					if( upperBand > 2.11669 )
						if( lowerBand <= 0.259124 )
							if( Color_con1 <= -1.90435 )
								if( wvf <= 0.244337 )
									ret := 0.772727 // buy
								if( wvf > 0.244337 )
									ret := -0.066667
							if( Color_con1 > -1.90435 )
								if( midLine <= 1.04523 )
									ret := 0.600000
								if( midLine > 1.04523 )
									ret := 0.907895 // buy
						if( lowerBand > 0.259124 )
							if( Color_con2 <= -1.30548 )
								if( Color_con2 <= -1.39582 )
									ret := -0.142857
								if( Color_con2 > -1.39582 )
									ret := -1.000000 // sell
							if( Color_con2 > -1.30548 )
								if( wvf <= 0.352128 )
									ret := 0.800000 // buy
								if( wvf > 0.352128 )
									ret := 0.100000
				if( sDev > 1.15863 )
					if( Color_con2 <= -2.31012 )
						if( midLine <= 2.234 )
							if( midLine <= 1.05264 )
								if( midLine <= 0.864731 )
									ret := 1.000000 // buy
								if( midLine > 0.864731 )
									ret := -0.333333
							if( midLine > 1.05264 )
								if( wvf <= 0.298992 )
									ret := 0.750000 // buy
								if( wvf > 0.298992 )
									ret := 0.950820 // buy
						if( midLine > 2.234 )
							if( wvf <= 0.928298 )
								if( Color_con2 <= -2.9767 )
									ret := -0.941176 // sell
								if( Color_con2 > -2.9767 )
									ret := -0.250000
							if( wvf > 0.928298 )
								if( midLine <= 2.8717 )
									ret := 1.000000 // buy
								if( midLine > 2.8717 )
									ret := 0.000000
					if( Color_con2 > -2.31012 )
						if( upperBand <= 4.63154 )
							if( Color_con2 <= -0.093942 )
								if( wvf <= 1.55082 )
									ret := -0.114883
								if( wvf > 1.55082 )
									ret := 0.727273 // buy
							if( Color_con2 > -0.093942 )
								if( lowerBand <= -0.867773 )
									ret := -0.918033 // sell
								if( lowerBand > -0.867773 )
									ret := -0.461538
						if( upperBand > 4.63154 )
							if( lowerBand <= -1.75661 )
								if( Color_con1 <= -1.9086 )
									ret := 0.854839 // buy
								if( Color_con1 > -1.9086 )
									ret := -0.625000
							if( lowerBand > -1.75661 )
								if( Color_con1 <= -3.87393 )
									ret := -0.840000 // sell
								if( Color_con1 > -3.87393 )
									ret := 0.525000
			if( Color_con1 > -1.46415 )
				if( Color_con2 <= -2.04474 )
					if( Color_con1 <= -1.07196 )
						if( sDev <= 0.831899 )
							if( Color_con2 <= -2.12194 )
								if( midLine <= 0.687191 )
									ret := -0.833333 // sell
								if( midLine > 0.687191 )
									ret := 0.000000
							if( Color_con2 > -2.12194 )
								ret := 1.000000 // buy
						if( sDev > 0.831899 )
							if( Color_con2 <= -4.20483 )
								ret := 1.000000 // buy
							if( Color_con2 > -4.20483 )
								ret := 0.250000
					if( Color_con1 > -1.07196 )
						if( midLine <= 0.259622 )
							if( sDev <= 0.267674 )
								if( Color_con1 <= -0.186302 )
									ret := 0.000000
								if( Color_con1 > -0.186302 )
									ret := -0.400000
							if( sDev > 0.267674 )
								if( Color_con2 <= -2.47432 )
									ret := 0.818182 // buy
								if( Color_con2 > -2.47432 )
									ret := -0.250000
						if( midLine > 0.259622 )
							if( wvf <= 0.097635 )
								if( lowerBand <= -0.160823 )
									ret := -0.250000
								if( lowerBand > -0.160823 )
									ret := 0.700000 // buy
							if( wvf > 0.097635 )
								if( lowerBand <= -0.404012 )
									ret := 0.500000
								if( lowerBand > -0.404012 )
									ret := -0.588889
				if( Color_con2 > -2.04474 )
					if( wvf <= 2.51628 )
						if( wvf <= 0.013195 )
							if( Color_con1 <= -0.256165 )
								if( midLine <= 0.113619 )
									ret := 0.305085
								if( midLine > 0.113619 )
									ret := -0.012024
							if( Color_con1 > -0.256165 )
								if( upperBand <= 0.077984 )
									ret := 0.246753
								if( upperBand > 0.077984 )
									ret := -0.177453
						if( wvf > 0.013195 )
							if( Color_con1 <= -1.03887 )
								if( sDev <= 0.732722 )
									ret := 0.062059
								if( sDev > 0.732722 )
									ret := -0.187879
							if( Color_con1 > -1.03887 )
								if( lowerBand <= 0.031781 )
									ret := 0.050372
								if( lowerBand > 0.031781 )
									ret := 0.016978
					if( wvf > 2.51628 )
						if( lowerBand <= -1.19176 )
							if( midLine <= 1.09451 )
								ret := 0.400000
							if( midLine > 1.09451 )
								if( wvf <= 2.6819 )
									ret := -0.500000
								if( wvf > 2.6819 )
									ret := -1.000000 // sell
						if( lowerBand > -1.19176 )
							if( wvf <= 2.77931 )
								if( sDev <= 1.43255 )
									ret := 1.000000 // buy
								if( sDev > 1.43255 )
									ret := 0.379310
							if( wvf > 2.77931 )
								if( Color_con1 <= -0.644851 )
									ret := 0.625000
								if( Color_con1 > -0.644851 )
									ret := 1.000000 // buy
		if( Color_con1 > 0.00913 )
			if( wvf <= 1.04544 )
				if( lowerBand <= -0.067955 )
					if( midLine <= 0.174101 )
						if( midLine <= 0.09898 )
							if( Color_con1 <= 0.20029 )
								if( upperBand <= 0.152518 )
									ret := -0.666667
								if( upperBand > 0.152518 )
									ret := 0.243243
							if( Color_con1 > 0.20029 )
								if( midLine <= 0.091071 )
									ret := -0.333333
								if( midLine > 0.091071 )
									ret := -0.800000 // sell
						if( midLine > 0.09898 )
							if( Color_con1 <= 0.06836 )
								if( Color_con2 <= -0.102478 )
									ret := 0.161290
								if( Color_con2 > -0.102478 )
									ret := 0.621622
							if( Color_con1 > 0.06836 )
								if( lowerBand <= -0.150158 )
									ret := 0.562044
								if( lowerBand > -0.150158 )
									ret := 0.222222
					if( midLine > 0.174101 )
						if( Color_con2 <= 0.70347 )
							if( Color_con1 <= 0.151947 )
								if( upperBand <= 0.568802 )
									ret := -0.055276
								if( upperBand > 0.568802 )
									ret := 0.227006
							if( Color_con1 > 0.151947 )
								if( Color_con2 <= 0.444441 )
									ret := 0.186667
								if( Color_con2 > 0.444441 )
									ret := 0.625000
						if( Color_con2 > 0.70347 )
							if( upperBand <= 0.788497 )
								ret := -1.000000 // sell
							if( upperBand > 0.788497 )
								if( lowerBand <= -0.367784 )
									ret := -1.000000 // sell
								if( lowerBand > -0.367784 )
									ret := 0.466667
				if( lowerBand > -0.067955 )
					if( lowerBand <= 0.122525 )
						if( lowerBand <= -0.025385 )
							if( Color_con1 <= 0.130915 )
								if( Color_con2 <= 0.192878 )
									ret := 0.194444
								if( Color_con2 > 0.192878 )
									ret := -0.168831
							if( Color_con1 > 0.130915 )
								if( Color_con2 <= 0.652614 )
									ret := 0.557895
								if( Color_con2 > 0.652614 )
									ret := -1.000000 // sell
						if( lowerBand > -0.025385 )
							if( midLine <= 0.395281 )
								if( midLine <= 0.250939 )
									ret := 0.023839
								if( midLine > 0.250939 )
									ret := -0.185185
							if( midLine > 0.395281 )
								if( upperBand <= 0.84891 )
									ret := 0.604167
								if( upperBand > 0.84891 )
									ret := -0.047619
					if( lowerBand > 0.122525 )
						if( wvf <= 0.902198 )
							if( sDev <= 0.269216 )
								if( midLine <= 0.395105 )
									ret := 0.544304
								if( midLine > 0.395105 )
									ret := -0.142857
							if( sDev > 0.269216 )
								if( Color_con1 <= 0.046716 )
									ret := 0.633333
								if( Color_con1 > 0.046716 )
									ret := 0.969697 // buy
						if( wvf > 0.902198 )
							if( midLine <= 0.606987 )
								if( midLine <= 0.567224 )
									ret := 0.200000
								if( midLine > 0.567224 )
									ret := -0.687500
							if( midLine > 0.606987 )
								ret := 0.833333 // buy
			if( wvf > 1.04544 )
				if( midLine <= 0.30343 )
					if( Color_con2 <= 0.812525 )
						if( lowerBand <= -0.423275 )
							ret := 0.200000
						if( lowerBand > -0.423275 )
							if( Color_con2 <= 0.376494 )
								ret := 0.750000 // buy
							if( Color_con2 > 0.376494 )
								ret := 1.000000 // buy
					if( Color_con2 > 0.812525 )
						if( wvf <= 1.17887 )
							if( sDev <= 0.540233 )
								if( midLine <= 0.194741 )
									ret := 0.600000
								if( midLine > 0.194741 )
									ret := -0.250000
							if( sDev > 0.540233 )
								if( wvf <= 1.07704 )
									ret := -1.000000 // sell
								if( wvf > 1.07704 )
									ret := -0.200000
						if( wvf > 1.17887 )
							if( lowerBand <= -0.423303 )
								if( sDev <= 0.806895 )
									ret := 0.000000
								if( sDev > 0.806895 )
									ret := 0.800000 // buy
							if( lowerBand > -0.423303 )
								if( Color_con2 <= 1.03273 )
									ret := 1.000000 // buy
								if( Color_con2 > 1.03273 )
									ret := 0.750000 // buy
				if( midLine > 0.30343 )
					if( wvf <= 1.20311 )
						if( sDev <= 0.497879 )
							if( sDev <= 0.426941 )
								if( Color_con2 <= 0.328294 )
									ret := 0.500000
								if( Color_con2 > 0.328294 )
									ret := -0.807692 // sell
							if( sDev > 0.426941 )
								if( Color_con2 <= 0.689121 )
									ret := 0.739130 // buy
								if( Color_con2 > 0.689121 )
									ret := -0.200000
						if( sDev > 0.497879 )
							if( Color_con2 <= 0.04081 )
								ret := 0.800000 // buy
							if( Color_con2 > 0.04081 )
								if( Color_con2 <= 0.615807 )
									ret := -0.771084 // sell
								if( Color_con2 > 0.615807 )
									ret := -0.229730
					if( wvf > 1.20311 )
						if( wvf <= 1.23811 )
							if( lowerBand <= 0.12413 )
								if( Color_con1 <= 0.142979 )
									ret := -0.125000
								if( Color_con1 > 0.142979 )
									ret := 0.812500 // buy
							if( lowerBand > 0.12413 )
								ret := 1.000000 // buy
						if( wvf > 1.23811 )
							if( Color_con2 <= 4.95608 )
								if( lowerBand <= -1.25413 )
									ret := -1.000000 // sell
								if( lowerBand > -1.25413 )
									ret := -0.108607
							if( Color_con2 > 4.95608 )
								ret := 1.000000 // buy
	if( lowerBand > 0.334718 )
		if( midLine <= 0.770666 )
			if( Color_con2 <= -0.253584 )
				if( wvf <= 0.484345 )
					if( midLine <= 0.72483 )
						if( upperBand <= 0.958294 )
							if( sDev <= 0.239126 )
								if( wvf <= 0.465202 )
									ret := -0.072917
								if( wvf > 0.465202 )
									ret := 0.642857
							if( sDev > 0.239126 )
								if( wvf <= 0.233753 )
									ret := -0.333333
								if( wvf > 0.233753 )
									ret := 0.692308
						if( upperBand > 0.958294 )
							if( upperBand <= 1.01558 )
								if( midLine <= 0.690627 )
									ret := -0.090909
								if( midLine > 0.690627 )
									ret := -0.774194 // sell
							if( upperBand > 1.01558 )
								if( Color_con2 <= -0.579875 )
									ret := 0.000000
								if( Color_con2 > -0.579875 )
									ret := 0.705882 // buy
					if( midLine > 0.72483 )
						if( upperBand <= 1.14958 )
							if( lowerBand <= 0.483819 )
								if( Color_con2 <= -0.59169 )
									ret := 0.000000
								if( Color_con2 > -0.59169 )
									ret := 0.779221 // buy
							if( lowerBand > 0.483819 )
								if( Color_con1 <= -0.562535 )
									ret := -0.666667
								if( Color_con1 > -0.562535 )
									ret := 1.000000 // buy
						if( upperBand > 1.14958 )
							ret := -0.600000
				if( wvf > 0.484345 )
					if( Color_con1 <= -0.103988 )
						if( sDev <= 0.236215 )
							if( upperBand <= 0.72695 )
								if( lowerBand <= 0.38131 )
									ret := 0.928571 // buy
								if( lowerBand > 0.38131 )
									ret := 0.333333
							if( upperBand > 0.72695 )
								if( Color_con2 <= -0.929406 )
									ret := -0.250000
								if( Color_con2 > -0.929406 )
									ret := 0.173913
						if( sDev > 0.236215 )
							if( midLine <= 0.64886 )
								ret := 1.000000 // buy
							if( midLine > 0.64886 )
								if( sDev <= 0.388553 )
									ret := 0.585586
								if( sDev > 0.388553 )
									ret := 1.000000 // buy
					if( Color_con1 > -0.103988 )
						if( sDev <= 0.141419 )
							ret := 0.750000 // buy
						if( sDev > 0.141419 )
							ret := 1.000000 // buy
			if( Color_con2 > -0.253584 )
				if( wvf <= 0.740959 )
					if( midLine <= 0.597473 )
						if( upperBand <= 0.709965 )
							if( Color_con1 <= -0.037895 )
								if( Color_con1 <= -0.070845 )
									ret := 0.174419
								if( Color_con1 > -0.070845 )
									ret := -0.666667
							if( Color_con1 > -0.037895 )
								if( wvf <= 0.596149 )
									ret := 0.750000 // buy
								if( wvf > 0.596149 )
									ret := 0.500000
						if( upperBand > 0.709965 )
							if( midLine <= 0.550802 )
								if( sDev <= 0.189892 )
									ret := 0.750000 // buy
								if( sDev > 0.189892 )
									ret := -0.444444
							if( midLine > 0.550802 )
								if( midLine <= 0.586088 )
									ret := 0.696629
								if( midLine > 0.586088 )
									ret := 0.333333
					if( midLine > 0.597473 )
						if( Color_con2 <= -0.097186 )
							if( midLine <= 0.650109 )
								if( Color_con1 <= -0.231851 )
									ret := -0.439394
								if( Color_con1 > -0.231851 )
									ret := 0.750000 // buy
							if( midLine > 0.650109 )
								if( Color_con1 <= -0.4757 )
									ret := -0.352941
								if( Color_con1 > -0.4757 )
									ret := 0.272727
						if( Color_con2 > -0.097186 )
							if( upperBand <= 0.9932 )
								if( sDev <= 0.136652 )
									ret := -0.692308
								if( sDev > 0.136652 )
									ret := -0.208791
							if( upperBand > 0.9932 )
								if( lowerBand <= 0.392274 )
									ret := -1.000000 // sell
								if( lowerBand > 0.392274 )
									ret := -0.750000 // sell
				if( wvf > 0.740959 )
					if( lowerBand <= 0.353708 )
						if( Color_con2 <= 0.095441 )
							if( colInt <= 0.5 )
								ret := 0.428571
							if( colInt > 0.5 )
								if( Color_con2 <= 0.045334 )
									ret := 0.428571
								if( Color_con2 > 0.045334 )
									ret := -0.764706 // sell
						if( Color_con2 > 0.095441 )
							if( lowerBand <= 0.342182 )
								ret := 0.000000
							if( lowerBand > 0.342182 )
								if( Color_con2 <= 0.159069 )
									ret := 0.500000
								if( Color_con2 > 0.159069 )
									ret := 1.000000 // buy
					if( lowerBand > 0.353708 )
						if( upperBand <= 1.13687 )
							if( Color_con1 <= -0.134249 )
								if( upperBand <= 1.02373 )
									ret := 0.821429 // buy
								if( upperBand > 1.02373 )
									ret := 0.500000
							if( Color_con1 > -0.134249 )
								if( Color_con1 <= -0.119973 )
									ret := -0.416667
								if( Color_con1 > -0.119973 )
									ret := 0.519481
						if( upperBand > 1.13687 )
							if( lowerBand <= 0.37909 )
								ret := -1.000000 // sell
							if( lowerBand > 0.37909 )
								ret := 0.200000
		if( midLine > 0.770666 )
			if( Color_con1 <= -1.49966 )
				if( lowerBand <= 2.1037 )
					if( upperBand <= 2.06431 )
						if( wvf <= 0.331216 )
							ret := 0.166667
						if( wvf > 0.331216 )
							if( sDev <= 0.739937 )
								ret := -1.000000 // sell
							if( sDev > 0.739937 )
								if( sDev <= 0.794567 )
									ret := -0.333333
								if( sDev > 0.794567 )
									ret := -1.000000 // sell
					if( upperBand > 2.06431 )
						if( upperBand <= 2.31196 )
							if( Color_con1 <= -1.6705 )
								if( Color_con2 <= -1.33799 )
									ret := -0.125000
								if( Color_con2 > -1.33799 )
									ret := 0.750000 // buy
							if( Color_con1 > -1.6705 )
								if( wvf <= 0.517682 )
									ret := -0.800000 // sell
								if( wvf > 0.517682 )
									ret := 0.296296
						if( upperBand > 2.31196 )
							if( wvf <= 0.841037 )
								if( lowerBand <= 0.970177 )
									ret := -0.601770
								if( lowerBand > 0.970177 )
									ret := 0.363636
							if( wvf > 0.841037 )
								if( Color_con2 <= -1.07205 )
									ret := 0.310000
								if( Color_con2 > -1.07205 )
									ret := -0.407407
				if( lowerBand > 2.1037 )
					if( sDev <= 2.02259 )
						ret := 0.750000 // buy
					if( sDev > 2.02259 )
						ret := 1.000000 // buy
			if( Color_con1 > -1.49966 )
				if( wvf <= 3.1675 )
					if( midLine <= 2.19121 )
						if( Color_con2 <= -1.84122 )
							if( sDev <= 0.443897 )
								ret := -1.000000 // sell
							if( sDev > 0.443897 )
								ret := -0.400000
						if( Color_con2 > -1.84122 )
							if( lowerBand <= 1.24235 )
								if( upperBand <= 2.14534 )
									ret := 0.134526
								if( upperBand > 2.14534 )
									ret := -0.107463
							if( lowerBand > 1.24235 )
								if( Color_con1 <= -0.552414 )
									ret := 0.857143 // buy
								if( Color_con1 > -0.552414 )
									ret := 0.250000
					if( midLine > 2.19121 )
						if( Color_con1 <= -0.592545 )
							if( upperBand <= 3.00321 )
								ret := 0.166667
							if( upperBand > 3.00321 )
								if( midLine <= 2.22235 )
									ret := -0.500000
								if( midLine > 2.22235 )
									ret := -0.975610 // sell
						if( Color_con1 > -0.592545 )
							if( sDev <= 0.880435 )
								ret := 0.750000 // buy
							if( sDev > 0.880435 )
								ret := -0.500000
				if( wvf > 3.1675 )
					if( midLine <= 3.12188 )
						ret := 1.000000 // buy
					if( midLine > 3.12188 )
						if( upperBand <= 6.52705 )
							ret := -0.600000
						if( upperBand > 6.52705 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_45975c0c(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


