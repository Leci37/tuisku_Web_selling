//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: UBER_15Min_1T00_9837bf64 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_1T00_9837bf64", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_9837bf64(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.276141 )
		if( ema3 <= 32.8798 )
			if( ema1 <= 17.7446 )
				if( tema <= 14.7794 )
					ret := 1.000000 // buy
				if( tema > 14.7794 )
					if( ema13 <= -0.578836 )
						if( ema1 <= 15.9893 )
							ret := -0.666667
						if( ema1 > 15.9893 )
							if( ema2 <= 17.0058 )
								ret := -1.000000 // sell
							if( ema2 > 17.0058 )
								ret := -0.750000 // sell
					if( ema13 > -0.578836 )
						ret := 0.000000
			if( ema1 > 17.7446 )
				if( ema13 <= -0.813049 )
					if( ema13 <= -1.39217 )
						ret := 1.000000 // buy
					if( ema13 > -1.39217 )
						if( ema13 <= -1.35694 )
							ret := -0.166667
						if( ema13 > -1.35694 )
							if( tema <= 19.5006 )
								ret := 1.000000 // buy
							if( tema > 19.5006 )
								if( ema1 <= 21.0274 )
									ret := -0.500000
								if( ema1 > 21.0274 )
									ret := 0.666667
				if( ema13 > -0.813049 )
					if( ema2 <= 21.6271 )
						if( ema1 <= 20.1133 )
							if( ema3 <= 19.7818 )
								if( ema2 <= 18.5466 )
									ret := 0.500000
								if( ema2 > 18.5466 )
									ret := 1.000000 // buy
							if( ema3 > 19.7818 )
								ret := 0.000000
						if( ema1 > 20.1133 )
							if( ema2 <= 21.0583 )
								if( tema <= 20.2468 )
									ret := 1.000000 // buy
								if( tema > 20.2468 )
									ret := 0.916667 // buy
							if( ema2 > 21.0583 )
								ret := 0.750000 // buy
					if( ema2 > 21.6271 )
						if( ema2 <= 26.1634 )
							if( ema3 <= 25.8476 )
								if( ema13 <= -0.597172 )
									ret := 0.363636
								if( ema13 > -0.597172 )
									ret := -0.216216
							if( ema3 > 25.8476 )
								if( ema12 <= -0.315401 )
									ret := -0.444444
								if( ema12 > -0.315401 )
									ret := -1.000000 // sell
						if( ema2 > 26.1634 )
							if( ema13 <= -0.618331 )
								if( tema <= 28.8465 )
									ret := 0.666667
								if( tema > 28.8465 )
									ret := -0.089041
							if( ema13 > -0.618331 )
								if( ema1 <= 27.0929 )
									ret := 0.215385
								if( ema1 > 27.0929 )
									ret := 0.607242
		if( ema3 > 32.8798 )
			if( ema3 <= 43.6312 )
				if( ema3 <= 37.4637 )
					if( ema3 <= 33.7289 )
						if( ema12 <= -0.489718 )
							if( ema3 <= 33.143 )
								ret := -0.166667
							if( ema3 > 33.143 )
								if( tema <= 31.9784 )
									ret := -1.000000 // sell
								if( tema > 31.9784 )
									ret := -0.750000 // sell
						if( ema12 > -0.489718 )
							if( ema3 <= 33.4224 )
								if( ema2 <= 32.9575 )
									ret := 0.105263
								if( ema2 > 32.9575 )
									ret := 0.800000 // buy
							if( ema3 > 33.4224 )
								if( ema13 <= -0.501038 )
									ret := -0.627907
								if( ema13 > -0.501038 )
									ret := 0.285714
					if( ema3 > 33.7289 )
						if( tema <= 34.141 )
							if( tema <= 33.2991 )
								if( ema2 <= 33.7529 )
									ret := 0.659574
								if( ema2 > 33.7529 )
									ret := -0.171429
							if( tema > 33.2991 )
								if( ema13 <= -0.965885 )
									ret := 0.222222
								if( ema13 > -0.965885 )
									ret := 0.878378 // buy
						if( tema > 34.141 )
							if( ema2 <= 35.4476 )
								if( ema3 <= 35.3402 )
									ret := 0.285714
								if( ema3 > 35.3402 )
									ret := -0.850000 // sell
							if( ema2 > 35.4476 )
								if( ema12 <= -0.536864 )
									ret := 0.923077 // buy
								if( ema12 > -0.536864 )
									ret := 0.123077
				if( ema3 > 37.4637 )
					if( ema1 <= 37.4921 )
						if( ema13 <= -0.879618 )
							if( ema2 <= 37.4254 )
								if( ema12 <= -0.486609 )
									ret := -0.750000 // sell
								if( ema12 > -0.486609 )
									ret := -0.500000
							if( ema2 > 37.4254 )
								ret := -0.200000
						if( ema13 > -0.879618 )
							if( ema2 <= 37.4425 )
								if( ema12 <= -0.43518 )
									ret := -0.750000 // sell
								if( ema12 > -0.43518 )
									ret := -0.857143 // sell
							if( ema2 > 37.4425 )
								if( ema3 <= 37.7938 )
									ret := -0.750000 // sell
								if( ema3 > 37.7938 )
									ret := -1.000000 // sell
					if( ema1 > 37.4921 )
						if( ema12 <= -0.654498 )
							if( tema <= 38.7327 )
								if( ema13 <= -1.59978 )
									ret := 0.000000
								if( ema13 > -1.59978 )
									ret := 0.863636 // buy
							if( tema > 38.7327 )
								if( ema12 <= -0.867022 )
									ret := -1.000000 // sell
								if( ema12 > -0.867022 )
									ret := 0.400000
						if( ema12 > -0.654498 )
							if( tema <= 37.2957 )
								if( tema <= 37.023 )
									ret := -0.666667
								if( tema > 37.023 )
									ret := 0.592593
							if( tema > 37.2957 )
								if( tema <= 38.9735 )
									ret := -0.206897
								if( tema > 38.9735 )
									ret := 0.062241
			if( ema3 > 43.6312 )
				if( ema2 <= 55.9366 )
					if( ema1 <= 50.0906 )
						if( tema <= 44.4537 )
							if( ema1 <= 44.0655 )
								if( ema2 <= 43.8597 )
									ret := 0.578125
								if( ema2 > 43.8597 )
									ret := -0.207792
							if( ema1 > 44.0655 )
								if( ema3 <= 45.4881 )
									ret := 0.655738
								if( ema3 > 45.4881 )
									ret := 0.242424
						if( tema > 44.4537 )
							if( ema3 <= 46.9085 )
								if( ema2 <= 45.9722 )
									ret := -0.030303
								if( ema2 > 45.9722 )
									ret := -0.750000 // sell
							if( ema3 > 46.9085 )
								if( tema <= 46.0737 )
									ret := 1.000000 // buy
								if( tema > 46.0737 )
									ret := 0.100503
					if( ema1 > 50.0906 )
						if( tema <= 51.7201 )
							if( ema13 <= -0.400612 )
								if( ema1 <= 51.4212 )
									ret := 0.630952
								if( ema1 > 51.4212 )
									ret := 0.853333 // buy
							if( ema13 > -0.400612 )
								ret := 0.000000
						if( tema > 51.7201 )
							if( ema3 <= 55.8472 )
								if( ema2 <= 55.0742 )
									ret := 0.300000
								if( ema2 > 55.0742 )
									ret := -0.571429
							if( ema3 > 55.8472 )
								if( tema <= 55.1324 )
									ret := 0.975000 // buy
								if( tema > 55.1324 )
									ret := 0.750000 // buy
				if( ema2 > 55.9366 )
					if( ema1 <= 64.3432 )
						if( ema13 <= -0.997281 )
							if( ema1 <= 56.1831 )
								if( ema1 <= 55.951 )
									ret := -0.958333 // sell
								if( ema1 > 55.951 )
									ret := -0.625000
							if( ema1 > 56.1831 )
								if( tema <= 61.2999 )
									ret := -0.083333
								if( tema > 61.2999 )
									ret := -0.764706 // sell
						if( ema13 > -0.997281 )
							if( ema1 <= 56.5272 )
								if( ema1 <= 55.9138 )
									ret := 0.000000
								if( ema1 > 55.9138 )
									ret := 0.514286
							if( ema1 > 56.5272 )
								if( ema13 <= -0.960434 )
									ret := 0.750000 // buy
								if( ema13 > -0.960434 )
									ret := -0.163701
					if( ema1 > 64.3432 )
						if( ema3 <= 72.4637 )
							if( ema13 <= -1.50911 )
								if( tema <= 64.4702 )
									ret := 0.937500 // buy
								if( tema > 64.4702 )
									ret := -0.636364
							if( ema13 > -1.50911 )
								if( tema <= 66.6353 )
									ret := 0.193548
								if( tema > 66.6353 )
									ret := 0.508000
						if( ema3 > 72.4637 )
							if( ema3 <= 74.3986 )
								if( ema1 <= 72.5791 )
									ret := 0.000000
								if( ema1 > 72.5791 )
									ret := -0.666667
							if( ema3 > 74.3986 )
								if( ema3 <= 76.4945 )
									ret := 0.575758
								if( ema3 > 76.4945 )
									ret := 0.000000
	if( ema12 > -0.276141 )
		if( ema1 <= 22.7812 )
			if( tema <= 22.4892 )
				if( ema13 <= -0.007037 )
					if( ema12 <= -0.079029 )
						if( ema2 <= 22.5509 )
							if( ema3 <= 20.0273 )
								if( tema <= 14.9267 )
									ret := 0.821429 // buy
								if( tema > 14.9267 )
									ret := -0.680000
							if( ema3 > 20.0273 )
								if( ema3 <= 21.2684 )
									ret := 0.792453 // buy
								if( ema3 > 21.2684 )
									ret := 0.292169
						if( ema2 > 22.5509 )
							if( tema <= 22.2915 )
								if( tema <= 22.0738 )
									ret := -1.000000 // sell
								if( tema > 22.0738 )
									ret := 0.540541
							if( tema > 22.2915 )
								if( ema2 <= 22.6566 )
									ret := -0.888889 // sell
								if( ema2 > 22.6566 )
									ret := -0.333333
					if( ema12 > -0.079029 )
						if( ema3 <= 15.0882 )
							if( ema3 <= 15.0543 )
								ret := 1.000000 // buy
							if( ema3 > 15.0543 )
								ret := 0.857143 // buy
						if( ema3 > 15.0882 )
							if( ema1 <= 19.6476 )
								if( tema <= 15.0092 )
									ret := -0.250000
								if( tema > 15.0092 )
									ret := -0.952381 // sell
							if( ema1 > 19.6476 )
								if( ema2 <= 20.4858 )
									ret := 0.806452 // buy
								if( ema2 > 20.4858 )
									ret := -0.223404
				if( ema13 > -0.007037 )
					if( ema3 <= 20.7689 )
						if( tema <= 20.8285 )
							if( tema <= 15.3869 )
								if( ema2 <= 15.118 )
									ret := 0.636364
								if( ema2 > 15.118 )
									ret := -1.000000 // sell
							if( tema > 15.3869 )
								if( ema13 <= 2.29034 )
									ret := 0.423729
								if( ema13 > 2.29034 )
									ret := -1.000000 // sell
						if( tema > 20.8285 )
							if( ema12 <= 0.097995 )
								if( ema13 <= 0.144241 )
									ret := -0.700000 // sell
								if( ema13 > 0.144241 )
									ret := 0.000000
							if( ema12 > 0.097995 )
								if( ema12 <= 0.176521 )
									ret := -0.833333 // sell
								if( ema12 > 0.176521 )
									ret := -1.000000 // sell
					if( ema3 > 20.7689 )
						if( ema3 <= 21.3388 )
							if( ema3 <= 20.9627 )
								if( ema2 <= 20.8317 )
									ret := 0.181818
								if( ema2 > 20.8317 )
									ret := 0.869048 // buy
							if( ema3 > 20.9627 )
								if( tema <= 21.1093 )
									ret := -1.000000 // sell
								if( tema > 21.1093 )
									ret := 0.521739
						if( ema3 > 21.3388 )
							if( ema3 <= 21.4838 )
								if( ema1 <= 21.4963 )
									ret := 0.325000
								if( ema1 > 21.4963 )
									ret := -0.461538
							if( ema3 > 21.4838 )
								if( tema <= 21.7013 )
									ret := 0.693333
								if( tema > 21.7013 )
									ret := 0.213592
			if( tema > 22.4892 )
				if( ema2 <= 22.7389 )
					if( ema13 <= 0.341851 )
						if( ema2 <= 22.5813 )
							if( ema1 <= 22.5891 )
								if( ema12 <= 0.003659 )
									ret := -0.500000
								if( ema12 > 0.003659 )
									ret := 0.433735
							if( ema1 > 22.5891 )
								if( ema1 <= 22.6663 )
									ret := -0.720000 // sell
								if( ema1 > 22.6663 )
									ret := 0.400000
						if( ema2 > 22.5813 )
							if( tema <= 22.9733 )
								if( ema13 <= -0.004832 )
									ret := 0.808989 // buy
								if( ema13 > -0.004832 )
									ret := 0.561404
							if( tema > 22.9733 )
								ret := -0.500000
					if( ema13 > 0.341851 )
						if( ema12 <= 0.255419 )
							if( ema13 <= 0.441115 )
								if( ema13 <= 0.372421 )
									ret := 0.933333 // buy
								if( ema13 > 0.372421 )
									ret := 1.000000 // buy
							if( ema13 > 0.441115 )
								ret := 0.750000 // buy
						if( ema12 > 0.255419 )
							if( ema13 <= 0.426394 )
								ret := -0.750000 // sell
							if( ema13 > 0.426394 )
								if( tema <= 22.9916 )
									ret := 0.000000
								if( tema > 22.9916 )
									ret := 0.954545 // buy
				if( ema2 > 22.7389 )
					if( ema2 <= 22.8315 )
						if( ema3 <= 22.7183 )
							ret := 0.600000
						if( ema3 > 22.7183 )
							if( ema1 <= 22.7076 )
								if( tema <= 22.6288 )
									ret := 0.000000
								if( tema > 22.6288 )
									ret := -1.000000 // sell
							if( ema1 > 22.7076 )
								if( ema12 <= 0.011781 )
									ret := 0.000000
								if( ema12 > 0.011781 )
									ret := -0.666667
					if( ema2 > 22.8315 )
						if( ema12 <= -0.143989 )
							if( ema2 <= 22.9484 )
								ret := -0.400000
							if( ema2 > 22.9484 )
								ret := 0.500000
						if( ema12 > -0.143989 )
							if( ema3 <= 22.9284 )
								ret := 0.400000
							if( ema3 > 22.9284 )
								ret := 1.000000 // buy
		if( ema1 > 22.7812 )
			if( ema12 <= -7.2e-05 )
				if( ema3 <= 29.5972 )
					if( tema <= 22.6046 )
						if( tema <= 22.5767 )
							if( ema13 <= -0.381555 )
								ret := 0.166667
							if( ema13 > -0.381555 )
								if( ema2 <= 23.07 )
									ret := 0.500000
								if( ema2 > 23.07 )
									ret := 0.800000 // buy
						if( tema > 22.5767 )
							if( ema2 <= 23.0062 )
								ret := 0.750000 // buy
							if( ema2 > 23.0062 )
								ret := 1.000000 // buy
					if( tema > 22.6046 )
						if( ema13 <= -0.467903 )
							if( ema1 <= 26.8991 )
								if( ema12 <= -0.224493 )
									ret := -0.692308
								if( ema12 > -0.224493 )
									ret := 0.058824
							if( ema1 > 26.8991 )
								if( ema2 <= 28.408 )
									ret := 0.709677 // buy
								if( ema2 > 28.408 )
									ret := -0.375000
						if( ema13 > -0.467903 )
							if( tema <= 29.413 )
								if( ema1 <= 29.4491 )
									ret := 0.126018
								if( ema1 > 29.4491 )
									ret := -0.636364
							if( tema > 29.413 )
								if( ema13 <= 0.017722 )
									ret := 0.683333
								if( ema13 > 0.017722 )
									ret := -1.000000 // sell
				if( ema3 > 29.5972 )
					if( ema3 <= 30.5773 )
						if( tema <= 29.0589 )
							if( ema3 <= 29.6201 )
								if( ema12 <= -0.208254 )
									ret := -0.750000 // sell
								if( ema12 > -0.208254 )
									ret := 0.750000 // buy
							if( ema3 > 29.6201 )
								if( ema13 <= -0.493646 )
									ret := 1.000000 // buy
								if( ema13 > -0.493646 )
									ret := 0.714286 // buy
						if( tema > 29.0589 )
							if( ema1 <= 29.3249 )
								if( ema2 <= 29.4386 )
									ret := -0.250000
								if( ema2 > 29.4386 )
									ret := -0.875000 // sell
							if( ema1 > 29.3249 )
								if( ema12 <= -0.086979 )
									ret := 0.028747
								if( ema12 > -0.086979 )
									ret := -0.156403
					if( ema3 > 30.5773 )
						if( ema2 <= 32.2951 )
							if( ema13 <= -0.020781 )
								if( tema <= 32.0297 )
									ret := 0.157767
								if( tema > 32.0297 )
									ret := 0.437186
							if( ema13 > -0.020781 )
								if( ema13 <= 0.028875 )
									ret := -0.206687
								if( ema13 > 0.028875 )
									ret := 0.377778
						if( ema2 > 32.2951 )
							if( ema3 <= 32.5543 )
								if( ema12 <= -0.170182 )
									ret := 0.500000
								if( ema12 > -0.170182 )
									ret := -0.291358
							if( ema3 > 32.5543 )
								if( ema2 <= 42.978 )
									ret := 0.070631
								if( ema2 > 42.978 )
									ret := 0.021229
			if( ema12 > -7.2e-05 )
				if( ema2 <= 22.8565 )
					if( ema2 <= 22.6591 )
						if( ema1 <= 23.0141 )
							if( ema1 <= 22.8265 )
								if( tema <= 22.9857 )
									ret := 1.000000 // buy
								if( tema > 22.9857 )
									ret := 0.000000
							if( ema1 > 22.8265 )
								ret := 1.000000 // buy
						if( ema1 > 23.0141 )
							ret := -1.000000 // sell
					if( ema2 > 22.6591 )
						if( ema3 <= 22.7844 )
							if( ema12 <= 0.028663 )
								ret := -1.000000 // sell
							if( ema12 > 0.028663 )
								if( tema <= 22.8939 )
									ret := -0.166667
								if( tema > 22.8939 )
									ret := -0.637931
						if( ema3 > 22.7844 )
							if( ema3 <= 22.8009 )
								ret := 0.500000
							if( ema3 > 22.8009 )
								if( ema1 <= 22.8611 )
									ret := 0.000000
								if( ema1 > 22.8611 )
									ret := -0.500000
				if( ema2 > 22.8565 )
					if( ema13 <= 0.184226 )
						if( ema2 <= 79.8065 )
							if( ema2 <= 78.1346 )
								if( ema12 <= 0.029744 )
									ret := 0.022245
								if( ema12 > 0.029744 )
									ret := -0.017802
							if( ema2 > 78.1346 )
								if( ema1 <= 79.6318 )
									ret := 0.333333
								if( ema1 > 79.6318 )
									ret := 0.684211
						if( ema2 > 79.8065 )
							if( ema3 <= 80.5794 )
								if( ema12 <= 0.053598 )
									ret := -0.272727
								if( ema12 > 0.053598 )
									ret := -0.830508 // sell
							if( ema3 > 80.5794 )
								if( ema1 <= 81.4906 )
									ret := 0.000000
								if( ema1 > 81.4906 )
									ret := -0.210526
					if( ema13 > 0.184226 )
						if( ema1 <= 81.5394 )
							if( ema3 <= 79.6325 )
								if( ema12 <= 0.60301 )
									ret := 0.055771
								if( ema12 > 0.60301 )
									ret := -0.141561
							if( ema3 > 79.6325 )
								if( ema12 <= 0.532733 )
									ret := -0.477778
								if( ema12 > 0.532733 )
									ret := 0.200000
						if( ema1 > 81.5394 )
							if( tema <= 85.6729 )
								if( ema2 <= 81.4279 )
									ret := 0.333333
								if( ema2 > 81.4279 )
									ret := 0.936170 // buy
							if( tema > 85.6729 )
								if( ema3 <= 84.4902 )
									ret := -0.714286 // sell
								if( ema3 > 84.4902 )
									ret := 0.090909
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_UBER_15Min_9837bf64(ema2, ema1, ema12, ema3, ema13, tema)

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


