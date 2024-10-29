//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: BNBUSDT_5Min_2ST0_ef90e400 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_5Min_2ST0_ef90e400", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_5Min_ef90e400(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 29.9738 )
		if( ema3 <= 519.177 )
			if( ema3 <= 233.497 )
				if( ema12 <= -0.571418 )
					if( d_k <= -3.77699 )
						if( ema13 <= -2.03568 )
							ret := 0.888889 // buy
						if( ema13 > -2.03568 )
							if( tema <= 213.947 )
								ret := 0.500000
							if( tema > 213.947 )
								if( rsi1 <= 25.6753 )
									ret := 0.000000
								if( rsi1 > 25.6753 )
									ret := -0.681818
					if( d_k > -3.77699 )
						if( rsi1 <= 13.8155 )
							if( rsi1 <= 10.5499 )
								if( rsi1 <= 8.24284 )
									ret := 0.769231 // buy
								if( rsi1 > 8.24284 )
									ret := 1.000000 // buy
							if( rsi1 > 10.5499 )
								if( ema12 <= -0.74777 )
									ret := -0.750000 // sell
								if( ema12 > -0.74777 )
									ret := 0.173913
						if( rsi1 > 13.8155 )
							if( k <= 48.2802 )
								if( ema2 <= 217.093 )
									ret := 0.875000 // buy
								if( ema2 > 217.093 )
									ret := 0.517045
							if( k > 48.2802 )
								ret := -0.550000
				if( ema12 > -0.571418 )
					if( tema <= 229.333 )
						if( smoothK_k <= 4.42163 )
							if( d <= 8.16833 )
								if( d <= 1.41946 )
									ret := 0.071197
								if( d > 1.41946 )
									ret := -0.227907
							if( d > 8.16833 )
								if( k <= 2.05504 )
									ret := -0.197802
								if( k > 2.05504 )
									ret := 0.419162
						if( smoothK_k > 4.42163 )
							if( k <= 39.3133 )
								if( ema3 <= 213.206 )
									ret := 0.141479
								if( ema3 > 213.206 )
									ret := 0.284698
							if( k > 39.3133 )
								if( ema1 <= 209.928 )
									ret := 0.310345
								if( ema1 > 209.928 )
									ret := -0.169935
					if( tema > 229.333 )
						if( ema13 <= -0.4746 )
							if( rsi1 <= 28.063 )
								if( k <= 4.3942 )
									ret := -0.125000
								if( k > 4.3942 )
									ret := -0.875817 // sell
							if( rsi1 > 28.063 )
								ret := 0.500000
						if( ema13 > -0.4746 )
							if( smoothD_d <= -2.05099 )
								ret := 1.000000 // buy
							if( smoothD_d > -2.05099 )
								if( smoothK_k <= -2.29944 )
									ret := -0.500000
								if( smoothK_k > -2.29944 )
									ret := -0.040000
			if( ema3 > 233.497 )
				if( ema2 <= 234.822 )
					if( d_k <= -0.896182 )
						if( smoothK_k <= 35.0404 )
							if( rsi1 <= 20.8432 )
								ret := 0.772727 // buy
							if( rsi1 > 20.8432 )
								if( d <= 14.5237 )
									ret := 1.000000 // buy
								if( d > 14.5237 )
									ret := 0.888889 // buy
						if( smoothK_k > 35.0404 )
							ret := 0.666667
					if( d_k > -0.896182 )
						if( k <= 10.5522 )
							if( smoothK_k <= 1.18659 )
								if( ema13 <= -0.69733 )
									ret := 0.600000
								if( ema13 > -0.69733 )
									ret := 0.857143 // buy
							if( smoothK_k > 1.18659 )
								if( rsi1 <= 24.2117 )
									ret := 0.777778 // buy
								if( rsi1 > 24.2117 )
									ret := 0.090909
						if( k > 10.5522 )
							ret := -0.416667
				if( ema2 > 234.822 )
					if( d <= 17.7254 )
						if( ema13 <= -0.750217 )
							if( ema2 <= 511.138 )
								if( d_k <= -0.078147 )
									ret := 0.131007
								if( d_k > -0.078147 )
									ret := 0.310972
							if( ema2 > 511.138 )
								if( smoothD_d <= 13.292 )
									ret := 0.740385 // buy
								if( smoothD_d > 13.292 )
									ret := -0.333333
						if( ema13 > -0.750217 )
							if( smoothK_k <= 3.66695 )
								if( ema3 <= 313.92 )
									ret := 0.071514
								if( ema3 > 313.92 )
									ret := -0.333333
							if( smoothK_k > 3.66695 )
								if( tema <= 265.148 )
									ret := 0.366667
								if( tema > 265.148 )
									ret := 0.014493
					if( d > 17.7254 )
						if( ema13 <= -5.04407 )
							if( ema3 <= 483.461 )
								if( ema13 <= -13.4102 )
									ret := -1.000000 // sell
								if( ema13 > -13.4102 )
									ret := 0.490196
							if( ema3 > 483.461 )
								if( d_k <= -2.1631 )
									ret := -0.680000
								if( d_k > -2.1631 )
									ret := -1.000000 // sell
						if( ema13 > -5.04407 )
							if( smoothK_k <= 14.2938 )
								if( ema12 <= -1.54056 )
									ret := 0.531250
								if( ema12 > -1.54056 )
									ret := -0.122159
							if( smoothK_k > 14.2938 )
								if( ema1 <= 513.575 )
									ret := 0.200313
								if( ema1 > 513.575 )
									ret := -0.720000 // sell
		if( ema3 > 519.177 )
			if( d <= 49.1341 )
				if( ema3 <= 549.999 )
					if( d <= 18.6869 )
						if( ema2 <= 548.201 )
							if( ema3 <= 529.264 )
								if( d_k <= -0.564609 )
									ret := 0.084000
								if( d_k > -0.564609 )
									ret := -0.360360
							if( ema3 > 529.264 )
								if( tema <= 529.525 )
									ret := 0.618497
								if( tema > 529.525 )
									ret := -0.060921
						if( ema2 > 548.201 )
							if( smoothD_d <= 1.98681 )
								if( k <= 0.62412 )
									ret := -0.916667 // sell
								if( k > 0.62412 )
									ret := -0.428571
							if( smoothD_d > 1.98681 )
								ret := -1.000000 // sell
					if( d > 18.6869 )
						if( ema2 <= 542.844 )
							if( rsi1 <= 27.3463 )
								if( ema2 <= 518.266 )
									ret := 0.181818
								if( ema2 > 518.266 )
									ret := -0.679558
							if( rsi1 > 27.3463 )
								if( ema12 <= -1.09705 )
									ret := -0.679012
								if( ema12 > -1.09705 )
									ret := 0.229167
						if( ema2 > 542.844 )
							if( ema13 <= -1.21541 )
								if( smoothK_k <= 13.6049 )
									ret := -0.818182 // sell
								if( smoothK_k > 13.6049 )
									ret := -0.100000
							if( ema13 > -1.21541 )
								ret := 1.000000 // buy
				if( ema3 > 549.999 )
					if( ema1 <= 611.082 )
						if( rsi1 <= 25.9444 )
							if( ema1 <= 550.89 )
								if( smoothD_d <= 0.566098 )
									ret := -0.066667
								if( smoothD_d > 0.566098 )
									ret := 0.805556 // buy
							if( ema1 > 550.89 )
								if( d_k <= 11.8476 )
									ret := 0.151105
								if( d_k > 11.8476 )
									ret := -0.203509
						if( rsi1 > 25.9444 )
							if( d <= 39.862 )
								if( tema <= 579.295 )
									ret := -0.094355
								if( tema > 579.295 )
									ret := 0.104839
							if( d > 39.862 )
								if( ema3 <= 556.705 )
									ret := 0.600000
								if( ema3 > 556.705 )
									ret := -0.566667
					if( ema1 > 611.082 )
						if( ema1 <= 697.099 )
							if( ema13 <= -1.0131 )
								if( ema13 <= -2.50704 )
									ret := -0.187215
								if( ema13 > -2.50704 )
									ret := -0.581921
							if( ema13 > -1.0131 )
								if( ema12 <= -0.61759 )
									ret := 1.000000 // buy
								if( ema12 > -0.61759 )
									ret := -0.187500
						if( ema1 > 697.099 )
							if( tema <= 705.512 )
								if( d_k <= 4.49523 )
									ret := 0.625000
								if( d_k > 4.49523 )
									ret := -0.375000
							if( tema > 705.512 )
								ret := -0.733333 // sell
			if( d > 49.1341 )
				if( ema1 <= 572.875 )
					if( smoothD_d <= 87.5522 )
						if( ema3 <= 540.602 )
							if( ema12 <= -1.58833 )
								if( ema1 <= 523.797 )
									ret := 0.500000
								if( ema1 > 523.797 )
									ret := 1.000000 // buy
							if( ema12 > -1.58833 )
								if( ema13 <= -2.31555 )
									ret := -0.645833
								if( ema13 > -2.31555 )
									ret := 0.617647
						if( ema3 > 540.602 )
							if( smoothK_k <= 87.2794 )
								if( d <= 61.1799 )
									ret := 0.400000
								if( d > 61.1799 )
									ret := 0.808824 // buy
							if( smoothK_k > 87.2794 )
								ret := -0.166667
					if( smoothD_d > 87.5522 )
						if( d_k <= 0.321052 )
							ret := -1.000000 // sell
						if( d_k > 0.321052 )
							ret := 0.000000
				if( ema1 > 572.875 )
					if( ema3 <= 580.34 )
						if( smoothD_d <= 64.472 )
							if( ema2 <= 577.916 )
								if( ema13 <= -1.85811 )
									ret := -1.000000 // sell
								if( ema13 > -1.85811 )
									ret := -0.900000 // sell
							if( ema2 > 577.916 )
								ret := -0.833333 // sell
						if( smoothD_d > 64.472 )
							if( d_k <= 16.5823 )
								ret := 0.307692
							if( d_k > 16.5823 )
								ret := -1.000000 // sell
					if( ema3 > 580.34 )
						if( tema <= 615.759 )
							if( smoothD_d <= 54.4862 )
								if( ema13 <= -4.6289 )
									ret := -0.142857
								if( ema13 > -4.6289 )
									ret := 0.655738
							if( smoothD_d > 54.4862 )
								if( d_k <= 4.92018 )
									ret := -0.413793
								if( d_k > 4.92018 )
									ret := 0.235294
						if( tema > 615.759 )
							if( ema2 <= 658.76 )
								ret := 1.000000 // buy
							if( ema2 > 658.76 )
								ret := 0.538462
	if( rsi1 > 29.9738 )
		if( ema1 <= 580.699 )
			if( ema12 <= 0.065791 )
				if( smoothK_k <= 50.0216 )
					if( ema3 <= 580.278 )
						if( k <= 5.46259 )
							if( ema13 <= 0.078969 )
								if( ema1 <= 536.285 )
									ret := 0.058603
								if( ema1 > 536.285 )
									ret := -0.062452
							if( ema13 > 0.078969 )
								if( ema2 <= 519.978 )
									ret := 0.299629
								if( ema2 > 519.978 )
									ret := 0.080000
						if( k > 5.46259 )
							if( rsi1 <= 46.2577 )
								if( smoothK_k <= 33.286 )
									ret := -0.042766
								if( smoothK_k > 33.286 )
									ret := 0.023690
							if( rsi1 > 46.2577 )
								if( k <= 16.2919 )
									ret := 0.116453
								if( k > 16.2919 )
									ret := 0.008900
					if( ema3 > 580.278 )
						if( smoothK_k <= 0.891377 )
							if( d <= 4.08957 )
								ret := 0.777778 // buy
							if( d > 4.08957 )
								if( k <= 2.70491 )
									ret := 1.000000 // buy
								if( k > 2.70491 )
									ret := 0.923077 // buy
						if( smoothK_k > 0.891377 )
							if( tema <= 579.299 )
								if( smoothD_d <= 29.3259 )
									ret := 0.702439 // buy
								if( smoothD_d > 29.3259 )
									ret := -0.195652
							if( tema > 579.299 )
								if( ema3 <= 581.333 )
									ret := 0.108974
								if( ema3 > 581.333 )
									ret := -0.666667
				if( smoothK_k > 50.0216 )
					if( ema3 <= 569.149 )
						if( tema <= 451.94 )
							if( ema2 <= 431.965 )
								if( ema3 <= 205.1 )
									ret := 0.909091 // buy
								if( ema3 > 205.1 )
									ret := 0.050417
							if( ema2 > 431.965 )
								if( rsi1 <= 51.0741 )
									ret := -0.925234 // sell
								if( rsi1 > 51.0741 )
									ret := -0.357143
						if( tema > 451.94 )
							if( tema <= 519.737 )
								if( smoothK_k <= 94.7047 )
									ret := 0.324480
								if( smoothK_k > 94.7047 )
									ret := -0.173228
							if( tema > 519.737 )
								if( ema1 <= 564.893 )
									ret := 0.078164
								if( ema1 > 564.893 )
									ret := 0.404444
					if( ema3 > 569.149 )
						if( ema3 <= 578.513 )
							if( rsi1 <= 33.5986 )
								if( tema <= 570.745 )
									ret := 0.436620
								if( tema > 570.745 )
									ret := -0.161290
							if( rsi1 > 33.5986 )
								if( tema <= 570.262 )
									ret := -0.331797
								if( tema > 570.262 )
									ret := -0.132399
						if( ema3 > 578.513 )
							if( rsi1 <= 47.488 )
								if( smoothD_d <= 55.1985 )
									ret := 0.629139
								if( smoothD_d > 55.1985 )
									ret := 0.160099
							if( rsi1 > 47.488 )
								if( k <= 70.6445 )
									ret := -0.485714
								if( k > 70.6445 )
									ret := 0.088083
			if( ema12 > 0.065791 )
				if( ema1 <= 265.259 )
					if( k <= 59.2013 )
						if( ema3 <= 251.105 )
							if( ema2 <= 248.747 )
								if( ema2 <= 243.336 )
									ret := 0.061277
								if( ema2 > 243.336 )
									ret := -0.150728
							if( ema2 > 248.747 )
								if( smoothD_d <= 6.56613 )
									ret := 0.843750 // buy
								if( smoothD_d > 6.56613 )
									ret := 0.267544
						if( ema3 > 251.105 )
							if( smoothD_d <= 8.89806 )
								if( ema2 <= 263.152 )
									ret := 0.574627
								if( ema2 > 263.152 )
									ret := -1.000000 // sell
							if( smoothD_d > 8.89806 )
								if( smoothD_d <= 71.0692 )
									ret := -0.375000
								if( smoothD_d > 71.0692 )
									ret := 0.818182 // buy
					if( k > 59.2013 )
						if( rsi1 <= 85.9215 )
							if( ema1 <= 214.466 )
								if( d <= 93.3725 )
									ret := -0.030264
								if( d > 93.3725 )
									ret := 0.126844
							if( ema1 > 214.466 )
								if( k <= 63.4898 )
									ret := -0.343799
								if( k > 63.4898 )
									ret := -0.098729
						if( rsi1 > 85.9215 )
							if( ema13 <= 0.726665 )
								if( ema13 <= 0.677524 )
									ret := -0.096000
								if( ema13 > 0.677524 )
									ret := 0.423077
							if( ema13 > 0.726665 )
								if( ema12 <= 1.81846 )
									ret := -0.546326
								if( ema12 > 1.81846 )
									ret := 0.777778 // buy
				if( ema1 > 265.259 )
					if( smoothD_d <= 96.2646 )
						if( ema2 <= 268.076 )
							if( k <= 67.152 )
								if( tema <= 269.175 )
									ret := -0.182692
								if( tema > 269.175 )
									ret := -1.000000 // sell
							if( k > 67.152 )
								if( d <= 86.8655 )
									ret := 0.835052 // buy
								if( d > 86.8655 )
									ret := 0.392857
						if( ema2 > 268.076 )
							if( ema2 <= 276.9 )
								if( d <= 98.4316 )
									ret := -0.113145
								if( d > 98.4316 )
									ret := -0.888889 // sell
							if( ema2 > 276.9 )
								if( ema3 <= 291.001 )
									ret := 0.726829 // buy
								if( ema3 > 291.001 )
									ret := 0.001405
					if( smoothD_d > 96.2646 )
						if( ema12 <= 3.85713 )
							if( smoothK_k <= 95.0962 )
								if( ema13 <= 1.44844 )
									ret := -0.642857
								if( ema13 > 1.44844 )
									ret := -1.000000 // sell
							if( smoothK_k > 95.0962 )
								if( ema13 <= 2.39989 )
									ret := -0.126151
								if( ema13 > 2.39989 )
									ret := -0.389908
						if( ema12 > 3.85713 )
							if( ema13 <= 9.99733 )
								if( ema3 <= 473.284 )
									ret := 1.000000 // buy
								if( ema3 > 473.284 )
									ret := 0.370370
							if( ema13 > 9.99733 )
								ret := 1.000000 // buy
		if( ema1 > 580.699 )
			if( ema13 <= 1.48304 )
				if( ema3 <= 706.581 )
					if( tema <= 693.258 )
						if( ema2 <= 607.825 )
							if( d <= 5.53075 )
								if( ema3 <= 589.536 )
									ret := -0.087662
								if( ema3 > 589.536 )
									ret := -0.298731
							if( d > 5.53075 )
								if( ema13 <= -0.717107 )
									ret := -0.083110
								if( ema13 > -0.717107 )
									ret := -0.015671
						if( ema2 > 607.825 )
							if( smoothD_d <= 19.7149 )
								if( ema1 <= 624.788 )
									ret := -0.079805
								if( ema1 > 624.788 )
									ret := 0.285388
							if( smoothD_d > 19.7149 )
								if( d_k <= -22.4508 )
									ret := 0.158824
								if( d_k > -22.4508 )
									ret := -0.175136
					if( tema > 693.258 )
						if( smoothD_d <= 74.988 )
							if( ema3 <= 703.965 )
								if( d_k <= -3.51395 )
									ret := 0.680473
								if( d_k > -3.51395 )
									ret := 0.117391
							if( ema3 > 703.965 )
								if( k <= 1.04895 )
									ret := 1.000000 // buy
								if( k > 1.04895 )
									ret := -0.037975
						if( smoothD_d > 74.988 )
							if( ema2 <= 697.478 )
								if( tema <= 694.473 )
									ret := 0.625000
								if( tema > 694.473 )
									ret := 0.928571 // buy
							if( ema2 > 697.478 )
								if( smoothD_d <= 75.7799 )
									ret := -1.000000 // sell
								if( smoothD_d > 75.7799 )
									ret := -0.190840
				if( ema3 > 706.581 )
					if( rsi1 <= 35.9022 )
						if( ema1 <= 709.006 )
							ret := 0.150000
						if( ema1 > 709.006 )
							ret := -1.000000 // sell
					if( rsi1 > 35.9022 )
						if( ema1 <= 710.144 )
							if( rsi1 <= 48.4099 )
								if( k <= 42.6084 )
									ret := -0.925373 // sell
								if( k > 42.6084 )
									ret := -0.571429
							if( rsi1 > 48.4099 )
								if( k <= 55.2359 )
									ret := -0.294118
								if( k > 55.2359 )
									ret := -0.833333 // sell
						if( ema1 > 710.144 )
							ret := -1.000000 // sell
			if( ema13 > 1.48304 )
				if( d_k <= -23.503 )
					if( ema12 <= 3.2702 )
						if( tema <= 600.58 )
							if( ema1 <= 595.823 )
								if( d_k <= -30.1529 )
									ret := 0.833333 // buy
								if( d_k > -30.1529 )
									ret := 0.571429
							if( ema1 > 595.823 )
								ret := 1.000000 // buy
						if( tema > 600.58 )
							if( ema1 <= 608.877 )
								ret := -0.600000
							if( ema1 > 608.877 )
								ret := 0.857143 // buy
					if( ema12 > 3.2702 )
						ret := -0.153846
				if( d_k > -23.503 )
					if( ema12 <= 3.07154 )
						if( ema2 <= 647.498 )
							if( ema1 <= 605.986 )
								if( smoothK_k <= -2.74016 )
									ret := -0.829787 // sell
								if( smoothK_k > -2.74016 )
									ret := -0.138654
							if( ema1 > 605.986 )
								if( d_k <= -9.9462 )
									ret := 0.164384
								if( d_k > -9.9462 )
									ret := -0.466525
						if( ema2 > 647.498 )
							if( d_k <= -15.78 )
								if( ema2 <= 670.88 )
									ret := -1.000000 // sell
								if( ema2 > 670.88 )
									ret := -0.521739
							if( d_k > -15.78 )
								if( smoothD_d <= 70.959 )
									ret := 0.313167
								if( smoothD_d > 70.959 )
									ret := -0.202381
					if( ema12 > 3.07154 )
						if( smoothK_k <= 84.053 )
							if( smoothD_d <= 30.6863 )
								if( ema13 <= 8.39962 )
									ret := -0.125000
								if( ema13 > 8.39962 )
									ret := -1.000000 // sell
							if( smoothD_d > 30.6863 )
								if( ema13 <= 12.9429 )
									ret := 0.581522
								if( ema13 > 12.9429 )
									ret := -1.000000 // sell
						if( smoothK_k > 84.053 )
							if( ema1 <= 623.023 )
								if( tema <= 611.827 )
									ret := -0.457831
								if( tema > 611.827 )
									ret := 0.940000 // buy
							if( ema1 > 623.023 )
								if( k <= 88.812 )
									ret := -1.000000 // sell
								if( k > 88.812 )
									ret := -0.600000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

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
float op_operation = decision_tree_0_BNBUSDT_5Min_ef90e400(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


