//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: NIO_5Min_1ADX_6717c479 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_1ADX_6717c479", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_6717c479(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementMinus <= 2e-05 )
		if( diPlus <= 64.2388 )
			if( adx <= 46.2114 )
				if( diPlus <= 6.60343 )
					if( trueRange <= 0.010143 )
						if( smoothedDirectionalMovementPlus <= 0 )
							if( trueRange <= 0.009534 )
								if( trueRange <= 0.005046 )
									ret := -0.324324
								if( trueRange > 0.005046 )
									ret := -1.000000 // sell
							if( trueRange > 0.009534 )
								if( adx <= 19.6836 )
									ret := -1.000000 // sell
								if( adx > 19.6836 )
									ret := 0.055944
						if( smoothedDirectionalMovementPlus > 0 )
							if( adx <= 39.9176 )
								if( smoothedTrueRange <= 0.010701 )
									ret := 0.485294
								if( smoothedTrueRange > 0.010701 )
									ret := 0.153605
							if( adx > 39.9176 )
								if( diMinus <= 15.9437 )
									ret := -0.253731
								if( diMinus > 15.9437 )
									ret := 0.060241
					if( trueRange > 0.010143 )
						if( smoothedTrueRange <= 0.022861 )
							if( diMinus <= 18.7285 )
								if( directionalMovementPlus <= 0.000846 )
									ret := 0.391892
								if( directionalMovementPlus > 0.000846 )
									ret := -0.116279
							if( diMinus > 18.7285 )
								if( smoothedTrueRange <= 0.017373 )
									ret := 0.225806
								if( smoothedTrueRange > 0.017373 )
									ret := 0.676647
						if( smoothedTrueRange > 0.022861 )
							if( diMinus <= 29.5006 )
								if( smoothedDirectionalMovementMinus <= 0.014842 )
									ret := 0.277778
								if( smoothedDirectionalMovementMinus > 0.014842 )
									ret := 0.818182 // buy
							if( diMinus > 29.5006 )
								if( adx <= 27.7895 )
									ret := -0.485714
								if( adx > 27.7895 )
									ret := 0.103226
				if( diPlus > 6.60343 )
					if( smoothedTrueRange <= 0.019295 )
						if( smoothedDirectionalMovementPlus <= 0.0019 )
							if( trueRange <= 0.010255 )
								if( adx <= 21.194 )
									ret := 0.104046
								if( adx > 21.194 )
									ret := 0.004736
							if( trueRange > 0.010255 )
								if( diMinus <= 11.4086 )
									ret := -0.032787
								if( diMinus > 11.4086 )
									ret := 0.267035
						if( smoothedDirectionalMovementPlus > 0.0019 )
							if( smoothedDirectionalMovementMinus <= 0.003943 )
								if( smoothedDirectionalMovementPlus <= 0.004644 )
									ret := -0.052653
								if( smoothedDirectionalMovementPlus > 0.004644 )
									ret := 0.034069
							if( smoothedDirectionalMovementMinus > 0.003943 )
								if( dx <= 39.0097 )
									ret := 0.109870
								if( dx > 39.0097 )
									ret := -0.068273
					if( smoothedTrueRange > 0.019295 )
						if( diMinus <= 41.9365 )
							if( smoothedTrueRange <= 0.121099 )
								if( smoothedDirectionalMovementPlus <= 0.002877 )
									ret := -0.047865
								if( smoothedDirectionalMovementPlus > 0.002877 )
									ret := 0.081971
							if( smoothedTrueRange > 0.121099 )
								if( diMinus <= 30.2168 )
									ret := -0.453416
								if( diMinus > 30.2168 )
									ret := 0.333333
						if( diMinus > 41.9365 )
							if( dx <= 56.1403 )
								if( adx <= 28.7882 )
									ret := 0.080645
								if( adx > 28.7882 )
									ret := -0.449814
							if( dx > 56.1403 )
								if( adx <= 43.9798 )
									ret := -0.048387
								if( adx > 43.9798 )
									ret := 0.571429
			if( adx > 46.2114 )
				if( dx <= 73.7022 )
					if( dx <= 50.2958 )
						if( diMinus <= 7.69942 )
							if( smoothedDirectionalMovementMinus <= 0.000714 )
								if( smoothedDirectionalMovementPlus <= 0.000906 )
									ret := -0.346154
								if( smoothedDirectionalMovementPlus > 0.000906 )
									ret := -0.690476
							if( smoothedDirectionalMovementMinus > 0.000714 )
								if( trueRange <= 0.010087 )
									ret := -0.025641
								if( trueRange > 0.010087 )
									ret := -0.360000
						if( diMinus > 7.69942 )
							if( smoothedDirectionalMovementPlus <= 0.030906 )
								if( smoothedDirectionalMovementMinus <= 0.017597 )
									ret := 0.026277
								if( smoothedDirectionalMovementMinus > 0.017597 )
									ret := 0.210918
							if( smoothedDirectionalMovementPlus > 0.030906 )
								if( dx <= 39.1746 )
									ret := -0.814815 // sell
								if( dx > 39.1746 )
									ret := -0.375000
					if( dx > 50.2958 )
						if( diPlus <= 8.66637 )
							if( smoothedDirectionalMovementPlus <= 0.001527 )
								if( diMinus <= 14.0444 )
									ret := 0.600000
								if( diMinus > 14.0444 )
									ret := -0.086111
							if( smoothedDirectionalMovementPlus > 0.001527 )
								if( dx <= 58.7856 )
									ret := -0.068750
								if( dx > 58.7856 )
									ret := -0.349593
						if( diPlus > 8.66637 )
							if( diMinus <= 32.3882 )
								if( dx <= 66.5633 )
									ret := -0.128648
								if( dx > 66.5633 )
									ret := 0.027921
							if( diMinus > 32.3882 )
								if( dx <= 57.2492 )
									ret := 0.268571
								if( dx > 57.2492 )
									ret := -0.006462
				if( dx > 73.7022 )
					if( dx <= 77.1916 )
						if( smoothedDirectionalMovementPlus <= 0.010027 )
							if( adx <= 61.1217 )
								if( diMinus <= 41.2542 )
									ret := -0.186441
								if( diMinus > 41.2542 )
									ret := 0.196429
							if( adx > 61.1217 )
								if( diPlus <= 6.28178 )
									ret := 0.356061
								if( diPlus > 6.28178 )
									ret := -0.036036
						if( smoothedDirectionalMovementPlus > 0.010027 )
							if( adx <= 68.8589 )
								if( adx <= 49.0254 )
									ret := -0.161290
								if( adx > 49.0254 )
									ret := 0.635897
							if( adx > 68.8589 )
								if( diPlus <= 57.9012 )
									ret := 0.250000
								if( diPlus > 57.9012 )
									ret := -0.866667 // sell
					if( dx > 77.1916 )
						if( smoothedTrueRange <= 0.043366 )
							if( adx <= 67.0764 )
								if( smoothedTrueRange <= 0.042938 )
									ret := 0.009759
								if( smoothedTrueRange > 0.042938 )
									ret := 0.909091 // buy
							if( adx > 67.0764 )
								if( trueRange <= 0.070971 )
									ret := 0.128818
								if( trueRange > 0.070971 )
									ret := -0.588235
						if( smoothedTrueRange > 0.043366 )
							if( diPlus <= 1.3456 )
								if( smoothedDirectionalMovementPlus <= 9.9e-05 )
									ret := 0.000000
								if( smoothedDirectionalMovementPlus > 9.9e-05 )
									ret := -0.675000
							if( diPlus > 1.3456 )
								if( smoothedTrueRange <= 0.075775 )
									ret := -0.173387
								if( smoothedTrueRange > 0.075775 )
									ret := 0.072398
		if( diPlus > 64.2388 )
			if( directionalMovementPlus <= 0.002939 )
				if( trueRange <= 0.060502 )
					if( diPlus <= 69.824 )
						if( smoothedDirectionalMovementMinus <= 0.00375 )
							if( trueRange <= 0.0128 )
								if( adx <= 21.9871 )
									ret := -0.571429
								if( adx > 21.9871 )
									ret := -0.125000
							if( trueRange > 0.0128 )
								if( smoothedDirectionalMovementPlus <= 0.023214 )
									ret := -0.933333 // sell
								if( smoothedDirectionalMovementPlus > 0.023214 )
									ret := -0.166667
						if( smoothedDirectionalMovementMinus > 0.00375 )
							if( smoothedTrueRange <= 0.057356 )
								ret := 1.000000 // buy
							if( smoothedTrueRange > 0.057356 )
								if( smoothedDirectionalMovementMinus <= 0.007473 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.007473 )
									ret := 0.500000
					if( diPlus > 69.824 )
						if( diMinus <= 3.12458 )
							if( dx <= 99.4135 )
								if( dx <= 94.9695 )
									ret := 0.500000
								if( dx > 94.9695 )
									ret := 1.000000 // buy
							if( dx > 99.4135 )
								if( adx <= 48.6679 )
									ret := 0.250000
								if( adx > 48.6679 )
									ret := 0.000000
						if( diMinus > 3.12458 )
							if( diMinus <= 4.15409 )
								ret := -1.000000 // sell
							if( diMinus > 4.15409 )
								if( smoothedDirectionalMovementMinus <= 0.003345 )
									ret := 0.031250
								if( smoothedDirectionalMovementMinus > 0.003345 )
									ret := -0.500000
				if( trueRange > 0.060502 )
					if( diPlus <= 71.0944 )
						ret := 0.500000
					if( diPlus > 71.0944 )
						ret := 1.000000 // buy
			if( directionalMovementPlus > 0.002939 )
				if( smoothedDirectionalMovementPlus <= 0.065035 )
					if( smoothedTrueRange <= 0.085993 )
						if( directionalMovementPlus <= 0.009278 )
							if( directionalMovementPlus <= 0.005932 )
								if( directionalMovementPlus <= 0.004905 )
									ret := -1.000000 // sell
								if( directionalMovementPlus > 0.004905 )
									ret := -0.250000
							if( directionalMovementPlus > 0.005932 )
								ret := -1.000000 // sell
						if( directionalMovementPlus > 0.009278 )
							if( trueRange <= 0.552237 )
								if( trueRange <= 0.089814 )
									ret := -0.346154
								if( trueRange > 0.089814 )
									ret := -0.071429
							if( trueRange > 0.552237 )
								ret := -1.000000 // sell
					if( smoothedTrueRange > 0.085993 )
						ret := 1.000000 // buy
				if( smoothedDirectionalMovementPlus > 0.065035 )
					ret := -1.000000 // sell
	if( directionalMovementMinus > 2e-05 )
		if( adx <= 26.6801 )
			if( smoothedDirectionalMovementPlus <= 0.010044 )
				if( adx <= 18.8486 )
					if( dx <= 48.4207 )
						if( diPlus <= 39.9602 )
							if( diPlus <= 32.8336 )
								if( trueRange <= 0.07244 )
									ret := 0.082662
								if( trueRange > 0.07244 )
									ret := -0.340909
							if( diPlus > 32.8336 )
								if( trueRange <= 0.010055 )
									ret := -0.020833
								if( trueRange > 0.010055 )
									ret := -0.500000
						if( diPlus > 39.9602 )
							if( diPlus <= 49.9361 )
								if( directionalMovementPlus <= 0.000546 )
									ret := 0.512195
								if( directionalMovementPlus > 0.000546 )
									ret := 1.000000 // buy
							if( diPlus > 49.9361 )
								ret := -0.400000
					if( dx > 48.4207 )
						if( dx <= 63.5051 )
							if( directionalMovementPlus <= 0.023085 )
								if( diMinus <= 46.3639 )
									ret := 0.571429
								if( diMinus > 46.3639 )
									ret := 0.000000
							if( directionalMovementPlus > 0.023085 )
								ret := -1.000000 // sell
						if( dx > 63.5051 )
							if( diMinus <= 7.95166 )
								ret := -0.750000 // sell
							if( diMinus > 7.95166 )
								if( dx <= 80.9472 )
									ret := -0.117647
								if( dx > 80.9472 )
									ret := 0.600000
				if( adx > 18.8486 )
					if( trueRange <= 0.030002 )
						if( directionalMovementMinus <= 0.009677 )
							if( diPlus <= 49.7145 )
								if( trueRange <= 0.019941 )
									ret := 0.337179
								if( trueRange > 0.019941 )
									ret := 0.131931
							if( diPlus > 49.7145 )
								ret := -1.000000 // sell
						if( directionalMovementMinus > 0.009677 )
							if( directionalMovementPlus <= 0.00014 )
								if( adx <= 20.1875 )
									ret := 0.196507
								if( adx > 20.1875 )
									ret := 0.041348
							if( directionalMovementPlus > 0.00014 )
								if( trueRange <= 0.028707 )
									ret := 0.687500
								if( trueRange > 0.028707 )
									ret := -0.500000
					if( trueRange > 0.030002 )
						if( smoothedTrueRange <= 0.018712 )
							if( adx <= 23.2534 )
								if( smoothedDirectionalMovementMinus <= 0.008761 )
									ret := 0.371429
								if( smoothedDirectionalMovementMinus > 0.008761 )
									ret := 1.000000 // buy
							if( adx > 23.2534 )
								if( diMinus <= 46.5505 )
									ret := 0.666667
								if( diMinus > 46.5505 )
									ret := 0.909091 // buy
						if( smoothedTrueRange > 0.018712 )
							if( smoothedTrueRange <= 0.03001 )
								if( diMinus <= 26.3476 )
									ret := -0.028169
								if( diMinus > 26.3476 )
									ret := 0.345070
							if( smoothedTrueRange > 0.03001 )
								if( dx <= 6.94909 )
									ret := -0.011236
								if( dx > 6.94909 )
									ret := 0.378086
			if( smoothedDirectionalMovementPlus > 0.010044 )
				if( diPlus <= 35.6004 )
					if( diMinus <= 30.9779 )
						if( dx <= 2.73914 )
							if( smoothedTrueRange <= 0.045686 )
								if( directionalMovementMinus <= 0.003243 )
									ret := -1.000000 // sell
								if( directionalMovementMinus > 0.003243 )
									ret := 0.521739
							if( smoothedTrueRange > 0.045686 )
								if( smoothedDirectionalMovementPlus <= 0.013052 )
									ret := -0.783784 // sell
								if( smoothedDirectionalMovementPlus > 0.013052 )
									ret := -0.220339
						if( dx > 2.73914 )
							if( dx <= 6.00908 )
								if( diPlus <= 26.3861 )
									ret := 0.203390
								if( diPlus > 26.3861 )
									ret := 0.864865 // buy
							if( dx > 6.00908 )
								if( dx <= 24.4291 )
									ret := -0.127983
								if( dx > 24.4291 )
									ret := 0.148867
					if( diMinus > 30.9779 )
						if( diPlus <= 23.3336 )
							if( adx <= 20.4299 )
								if( adx <= 15.7098 )
									ret := 0.866667 // buy
								if( adx > 15.7098 )
									ret := -0.050000
							if( adx > 20.4299 )
								if( directionalMovementPlus <= 0.000431 )
									ret := 0.807692 // buy
								if( directionalMovementPlus > 0.000431 )
									ret := 1.000000 // buy
						if( diPlus > 23.3336 )
							if( directionalMovementMinus <= 0.005762 )
								ret := 0.600000
							if( directionalMovementMinus > 0.005762 )
								if( diMinus <= 35.5434 )
									ret := -0.200000
								if( diMinus > 35.5434 )
									ret := -0.818182 // sell
				if( diPlus > 35.6004 )
					if( directionalMovementMinus <= 0.000889 )
						ret := 0.600000
					if( directionalMovementMinus > 0.000889 )
						if( adx <= 26.4382 )
							if( diMinus <= 20.5033 )
								if( trueRange <= 0.039533 )
									ret := -0.545455
								if( trueRange > 0.039533 )
									ret := -0.937500 // sell
							if( diMinus > 20.5033 )
								if( dx <= 24.3056 )
									ret := -0.833333 // sell
								if( dx > 24.3056 )
									ret := 0.142857
						if( adx > 26.4382 )
							ret := 0.571429
		if( adx > 26.6801 )
			if( diMinus <= 31.718 )
				if( diMinus <= 15.436 )
					if( diPlus <= 40.5397 )
						if( diMinus <= 5.04275 )
							if( smoothedDirectionalMovementMinus <= 0.002389 )
								if( adx <= 54.4182 )
									ret := -0.340000
								if( adx > 54.4182 )
									ret := 0.005714
							if( smoothedDirectionalMovementMinus > 0.002389 )
								if( dx <= 76.1541 )
									ret := -0.500000
								if( dx > 76.1541 )
									ret := -1.000000 // sell
						if( diMinus > 5.04275 )
							if( diPlus <= 24.361 )
								if( adx <= 44.6848 )
									ret := 0.060741
								if( adx > 44.6848 )
									ret := 0.202899
							if( diPlus > 24.361 )
								if( diPlus <= 32.8256 )
									ret := -0.034783
								if( diPlus > 32.8256 )
									ret := 0.144721
					if( diPlus > 40.5397 )
						if( smoothedDirectionalMovementMinus <= 0.000677 )
							if( dx <= 94.627 )
								ret := 0.000000
							if( dx > 94.627 )
								if( directionalMovementPlus <= 0.000303 )
									ret := -0.571429
								if( directionalMovementPlus > 0.000303 )
									ret := -1.000000 // sell
						if( smoothedDirectionalMovementMinus > 0.000677 )
							if( dx <= 81.5577 )
								if( dx <= 75.5552 )
									ret := 0.231056
								if( dx > 75.5552 )
									ret := -0.291667
							if( dx > 81.5577 )
								if( dx <= 88.2201 )
									ret := 0.655172
								if( dx > 88.2201 )
									ret := 0.163636
				if( diMinus > 15.436 )
					if( diPlus <= 21.1992 )
						if( diPlus <= 18.095 )
							if( directionalMovementMinus <= 0.071989 )
								if( smoothedTrueRange <= 0.058933 )
									ret := 0.016878
								if( smoothedTrueRange > 0.058933 )
									ret := 0.183673
							if( directionalMovementMinus > 0.071989 )
								if( trueRange <= 0.105729 )
									ret := 0.000000
								if( trueRange > 0.105729 )
									ret := -0.727273 // sell
						if( diPlus > 18.095 )
							if( diPlus <= 18.3496 )
								if( diPlus <= 18.1367 )
									ret := 0.166667
								if( diPlus > 18.1367 )
									ret := 0.636364
							if( diPlus > 18.3496 )
								if( adx <= 60.3419 )
									ret := 0.100637
								if( adx > 60.3419 )
									ret := 0.521127
					if( diPlus > 21.1992 )
						if( diMinus <= 18.7528 )
							if( dx <= 33.0494 )
								if( dx <= 22.0022 )
									ret := -0.230769
								if( dx > 22.0022 )
									ret := 0.137255
							if( dx > 33.0494 )
								if( diMinus <= 16.0856 )
									ret := -0.036036
								if( diMinus > 16.0856 )
									ret := -0.395437
						if( diMinus > 18.7528 )
							if( adx <= 45.2674 )
								if( adx <= 42.9934 )
									ret := -0.010392
								if( adx > 42.9934 )
									ret := -0.328244
							if( adx > 45.2674 )
								if( trueRange <= 0.055449 )
									ret := 0.221837
								if( trueRange > 0.055449 )
									ret := -0.139896
			if( diMinus > 31.718 )
				if( adx <= 61.4167 )
					if( adx <= 51.2204 )
						if( dx <= 77.5807 )
							if( diMinus <= 32.7492 )
								if( directionalMovementPlus <= 0.000966 )
									ret := 0.232472
								if( directionalMovementPlus > 0.000966 )
									ret := 0.781818 // buy
							if( diMinus > 32.7492 )
								if( smoothedDirectionalMovementPlus <= 0.00715 )
									ret := 0.120441
								if( smoothedDirectionalMovementPlus > 0.00715 )
									ret := -0.088553
						if( dx > 77.5807 )
							if( diMinus <= 39.2405 )
								if( trueRange <= 0.07835 )
									ret := 0.169355
								if( trueRange > 0.07835 )
									ret := -0.880000 // sell
							if( diMinus > 39.2405 )
								if( diMinus <= 46.9533 )
									ret := 0.625641
								if( diMinus > 46.9533 )
									ret := 0.249292
					if( adx > 51.2204 )
						if( trueRange <= 0.119693 )
							if( smoothedDirectionalMovementPlus <= 0.00679 )
								if( dx <= 40.2288 )
									ret := 0.333333
								if( dx > 40.2288 )
									ret := -0.086221
							if( smoothedDirectionalMovementPlus > 0.00679 )
								if( dx <= 57.8451 )
									ret := 0.675000
								if( dx > 57.8451 )
									ret := -0.321429
						if( trueRange > 0.119693 )
							if( smoothedDirectionalMovementMinus <= 0.027651 )
								if( dx <= 84.6124 )
									ret := -0.385965
								if( dx > 84.6124 )
									ret := 0.750000 // buy
							if( smoothedDirectionalMovementMinus > 0.027651 )
								if( directionalMovementPlus <= 0.010676 )
									ret := -0.837209 // sell
								if( directionalMovementPlus > 0.010676 )
									ret := 0.000000
				if( adx > 61.4167 )
					if( directionalMovementMinus <= 0.010003 )
						if( adx <= 98.563 )
							if( adx <= 87.6071 )
								if( diPlus <= 1.34673 )
									ret := -0.310345
								if( diPlus > 1.34673 )
									ret := 0.155096
							if( adx > 87.6071 )
								if( diPlus <= 4.74596 )
									ret := 0.687500
								if( diPlus > 4.74596 )
									ret := -0.300000
						if( adx > 98.563 )
							if( adx <= 99.2254 )
								ret := -0.750000 // sell
							if( adx > 99.2254 )
								ret := -1.000000 // sell
					if( directionalMovementMinus > 0.010003 )
						if( diMinus <= 48.7988 )
							if( diPlus <= 2.35949 )
								if( dx <= 96.6611 )
									ret := 0.770115 // buy
								if( dx > 96.6611 )
									ret := 0.391892
							if( diPlus > 2.35949 )
								if( dx <= 38.3197 )
									ret := 0.593407
								if( dx > 38.3197 )
									ret := 0.230072
						if( diMinus > 48.7988 )
							if( smoothedDirectionalMovementPlus <= 0.003422 )
								if( diPlus <= 3.1951 )
									ret := -0.040698
								if( diPlus > 3.1951 )
									ret := 0.490566
							if( smoothedDirectionalMovementPlus > 0.003422 )
								if( diMinus <= 58.7297 )
									ret := -0.552632
								if( diMinus > 58.7297 )
									ret := 0.368421
	
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
float op_operation = decision_tree_0_NIO_5Min_6717c479(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


