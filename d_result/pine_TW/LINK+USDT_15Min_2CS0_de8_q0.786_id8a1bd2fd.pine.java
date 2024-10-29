//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: LINKUSDT_15Min_2CS0_8a1bd2fd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2CS0_8a1bd2fd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_8a1bd2fd(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 56.3671 )
		if( rsi1 <= 41.7141 )
			if( mf <= -0.116644 )
				if( smoothD_d <= 18.4626 )
					if( ad <= 155797 )
						if( ad_mf <= -340015 )
							if( rsi1 <= 15.4242 )
								ret := -0.076923
							if( rsi1 > 15.4242 )
								if( smoothK_k <= 8.58525 )
									ret := 1.000000 // buy
								if( smoothK_k > 8.58525 )
									ret := 0.571429
						if( ad_mf > -340015 )
							if( rsi1 <= 33.3241 )
								if( k <= 0.012791 )
									ret := -0.027778
								if( k > 0.012791 )
									ret := -0.343734
							if( rsi1 > 33.3241 )
								if( ad_mf <= -49444.2 )
									ret := 0.098639
								if( ad_mf > -49444.2 )
									ret := -0.142653
					if( ad > 155797 )
						if( ad <= 178905 )
							if( smoothK_k <= 12.2483 )
								ret := 0.400000
							if( smoothK_k > 12.2483 )
								ret := 0.400000
						if( ad > 178905 )
							ret := 1.000000 // buy
				if( smoothD_d > 18.4626 )
					if( d_k <= 1.93988 )
						if( smoothK_k <= 41.3644 )
							if( ad <= -88848.1 )
								if( k <= 25.2511 )
									ret := -0.666667
								if( k > 25.2511 )
									ret := 0.533784
							if( ad > -88848.1 )
								if( d_k <= -13.9474 )
									ret := -0.421053
								if( d_k > -13.9474 )
									ret := -0.034409
						if( smoothK_k > 41.3644 )
							if( ad <= -37462.8 )
								if( k <= 46.2587 )
									ret := -0.029412
								if( k > 46.2587 )
									ret := 0.496732
							if( ad > -37462.8 )
								if( d <= 51.9063 )
									ret := 0.107062
								if( d > 51.9063 )
									ret := -0.612903
					if( d_k > 1.93988 )
						if( k <= 17.1494 )
							if( ad_mf <= -23571.7 )
								if( smoothK_k <= 10.6894 )
									ret := 0.000000
								if( smoothK_k > 10.6894 )
									ret := 0.576923
							if( ad_mf > -23571.7 )
								if( ad_mf <= 45410.2 )
									ret := -0.308057
								if( ad_mf > 45410.2 )
									ret := 0.285714
						if( k > 17.1494 )
							if( ad <= -34184.8 )
								if( ad <= -35256.1 )
									ret := 0.053704
								if( ad > -35256.1 )
									ret := 0.823529 // buy
							if( ad > -34184.8 )
								if( ad_mf <= 7677.48 )
									ret := -0.270308
								if( ad_mf > 7677.48 )
									ret := -0.528875
			if( mf > -0.116644 )
				if( smoothD_d <= 8.88061 )
					if( ad <= 18136.2 )
						if( ad <= -158229 )
							if( mf <= -0.022906 )
								if( mf <= -0.095218 )
									ret := -0.200000
								if( mf > -0.095218 )
									ret := 0.680000
							if( mf > -0.022906 )
								if( ad <= -263829 )
									ret := -1.000000 // sell
								if( ad > -263829 )
									ret := -0.444444
						if( ad > -158229 )
							if( rsi1 <= 32.0132 )
								if( smoothK_k <= -2.99264 )
									ret := -0.435659
								if( smoothK_k > -2.99264 )
									ret := -0.631467
							if( rsi1 > 32.0132 )
								if( d_k <= 1.75988 )
									ret := -0.471890
								if( d_k > 1.75988 )
									ret := -0.354662
					if( ad > 18136.2 )
						if( mf <= 0.086337 )
							if( ad <= 53999.3 )
								if( ad_mf <= 22698.8 )
									ret := -0.491525
								if( ad_mf > 22698.8 )
									ret := -0.682470
							if( ad > 53999.3 )
								if( k <= 2.64376 )
									ret := -0.695652
								if( k > 2.64376 )
									ret := -0.208791
						if( mf > 0.086337 )
							if( d <= 1.47717 )
								if( smoothK_k <= -0.08628 )
									ret := -0.701031 // sell
								if( smoothK_k > -0.08628 )
									ret := -0.272727
							if( d > 1.47717 )
								if( ad_mf <= 56266.2 )
									ret := -0.871269 // sell
								if( ad_mf > 56266.2 )
									ret := -0.729730 // sell
				if( smoothD_d > 8.88061 )
					if( d_k <= 2.6204 )
						if( smoothD_d <= 18.5735 )
							if( ad <= -120871 )
								if( rsi1 <= 31.9163 )
									ret := 0.730769 // buy
								if( rsi1 > 31.9163 )
									ret := 0.060606
							if( ad > -120871 )
								if( d_k <= -11.5391 )
									ret := -0.158672
								if( d_k > -11.5391 )
									ret := -0.389522
						if( smoothD_d > 18.5735 )
							if( rsi1 <= 39.618 )
								if( ad <= 247934 )
									ret := -0.241693
								if( ad > 247934 )
									ret := 0.681818
							if( rsi1 > 39.618 )
								if( mf <= -0.021957 )
									ret := 0.160535
								if( mf > -0.021957 )
									ret := -0.236842
					if( d_k > 2.6204 )
						if( mf <= 0.012199 )
							if( rsi1 <= 28.3249 )
								if( smoothK_k <= -2.42861 )
									ret := -0.076923
								if( smoothK_k > -2.42861 )
									ret := -0.566929
							if( rsi1 > 28.3249 )
								if( d <= 42.2972 )
									ret := -0.354400
								if( d > 42.2972 )
									ret := -0.208955
						if( mf > 0.012199 )
							if( ad_mf <= 3423.82 )
								if( d <= 49.6938 )
									ret := -0.425711
								if( d > 49.6938 )
									ret := -0.123404
							if( ad_mf > 3423.82 )
								if( smoothD_d <= 66.7515 )
									ret := -0.613705
								if( smoothD_d > 66.7515 )
									ret := 0.076923
		if( rsi1 > 41.7141 )
			if( ad <= 12234.4 )
				if( d_k <= -6.27957 )
					if( smoothK_k <= 32.5776 )
						if( ad_mf <= -52889 )
							if( mf <= -0.124018 )
								if( d <= 22.3833 )
									ret := -0.727273 // sell
								if( d > 22.3833 )
									ret := -0.444444
							if( mf > -0.124018 )
								if( rsi1 <= 56.5186 )
									ret := 0.261905
								if( rsi1 > 56.5186 )
									ret := 0.772727 // buy
						if( ad_mf > -52889 )
							if( ad_mf <= -47734.3 )
								if( ad_mf <= -49364.6 )
									ret := -0.375000
								if( ad_mf > -49364.6 )
									ret := -0.923077 // sell
							if( ad_mf > -47734.3 )
								if( ad_mf <= -47022.7 )
									ret := 0.916667 // buy
								if( ad_mf > -47022.7 )
									ret := -0.021753
					if( smoothK_k > 32.5776 )
						if( ad <= -82601.9 )
							if( d_k <= -10.6963 )
								if( mf <= -0.019986 )
									ret := -0.302326
								if( mf > -0.019986 )
									ret := -0.657143
							if( d_k > -10.6963 )
								if( ad <= -133469 )
									ret := 0.750000 // buy
								if( ad > -133469 )
									ret := -0.111111
						if( ad > -82601.9 )
							if( d_k <= -7.79366 )
								if( d_k <= -18.3704 )
									ret := 0.086538
								if( d_k > -18.3704 )
									ret := 0.243605
							if( d_k > -7.79366 )
								if( mf <= -0.209959 )
									ret := 0.900000 // buy
								if( mf > -0.209959 )
									ret := 0.399340
				if( d_k > -6.27957 )
					if( smoothD_d <= 13.1744 )
						if( d <= 3.69709 )
							if( rsi1 <= 49.4181 )
								if( smoothK_k <= -2.80016 )
									ret := -0.142857
								if( smoothK_k > -2.80016 )
									ret := -0.440104
							if( rsi1 > 49.4181 )
								if( smoothD_d <= 0.248693 )
									ret := -0.004405
								if( smoothD_d > 0.248693 )
									ret := -0.395349
						if( d > 3.69709 )
							if( smoothD_d <= 13.1124 )
								if( ad <= 12050.8 )
									ret := -0.108005
								if( ad > 12050.8 )
									ret := 0.769231 // buy
							if( smoothD_d > 13.1124 )
								ret := -0.882353 // sell
					if( smoothD_d > 13.1744 )
						if( rsi1 <= 61.345 )
							if( d_k <= 4.87184 )
								if( smoothD_d <= 50.1201 )
									ret := 0.026257
								if( smoothD_d > 50.1201 )
									ret := 0.220588
							if( d_k > 4.87184 )
								if( ad_mf <= 11164.2 )
									ret := -0.101548
								if( ad_mf > 11164.2 )
									ret := -0.544218
						if( rsi1 > 61.345 )
							if( rsi1 <= 67.8794 )
								if( mf <= -0.099792 )
									ret := -0.394737
								if( mf > -0.099792 )
									ret := 0.228885
							if( rsi1 > 67.8794 )
								if( d_k <= 3.68991 )
									ret := 0.556650
								if( d_k > 3.68991 )
									ret := 0.307692
			if( ad > 12234.4 )
				if( mf <= 0.037527 )
					if( smoothD_d <= 8.77689 )
						if( d <= 6.52685 )
							if( rsi1 <= 42.3602 )
								if( smoothD_d <= 1.63563 )
									ret := -1.000000 // sell
								if( smoothD_d > 1.63563 )
									ret := -0.600000
							if( rsi1 > 42.3602 )
								if( d_k <= 2.82892 )
									ret := -0.234286
								if( d_k > 2.82892 )
									ret := 0.705882 // buy
						if( d > 6.52685 )
							if( k <= 3.98965 )
								if( ad_mf <= 28657 )
									ret := -0.533333
								if( ad_mf > 28657 )
									ret := -1.000000 // sell
							if( k > 3.98965 )
								if( ad <= 135636 )
									ret := -0.351536
								if( ad > 135636 )
									ret := -1.000000 // sell
					if( smoothD_d > 8.77689 )
						if( smoothK_k <= 15.0914 )
							if( mf <= -0.084717 )
								if( ad <= 37428.8 )
									ret := 0.164179
								if( ad > 37428.8 )
									ret := -0.333333
							if( mf > -0.084717 )
								if( smoothD_d <= 13.7359 )
									ret := -0.118881
								if( smoothD_d > 13.7359 )
									ret := -0.481633
						if( smoothK_k > 15.0914 )
							if( smoothK_k <= 49.2108 )
								if( smoothD_d <= 39.4635 )
									ret := 0.018488
								if( smoothD_d > 39.4635 )
									ret := -0.168782
							if( smoothK_k > 49.2108 )
								if( k <= 56.0785 )
									ret := -0.197861
								if( k > 56.0785 )
									ret := -0.718750 // sell
				if( mf > 0.037527 )
					if( d <= 22.8041 )
						if( smoothD_d <= 9.86931 )
							if( mf <= 0.164948 )
								if( mf <= 0.094233 )
									ret := -0.443396
								if( mf > 0.094233 )
									ret := -0.631944
							if( mf > 0.164948 )
								if( ad <= 14223.6 )
									ret := 0.155172
								if( ad > 14223.6 )
									ret := -0.481481
						if( smoothD_d > 9.86931 )
							if( rsi1 <= 58.7478 )
								if( smoothK_k <= 14.1708 )
									ret := -0.620758
								if( smoothK_k > 14.1708 )
									ret := -0.345351
							if( rsi1 > 58.7478 )
								if( ad <= 72487.9 )
									ret := -0.079268
								if( ad > 72487.9 )
									ret := 0.354839
					if( d > 22.8041 )
						if( smoothD_d <= 64.7516 )
							if( rsi1 <= 56.8733 )
								if( ad_mf <= 43530.1 )
									ret := -0.256266
								if( ad_mf > 43530.1 )
									ret := -0.472744
							if( rsi1 > 56.8733 )
								if( k <= 54.4122 )
									ret := -0.107930
								if( k > 54.4122 )
									ret := -0.396341
						if( smoothD_d > 64.7516 )
							if( ad_mf <= 19892.4 )
								if( d_k <= 20.9768 )
									ret := 0.666667
								if( d_k > 20.9768 )
									ret := 0.000000
							if( ad_mf > 19892.4 )
								if( mf <= 0.053009 )
									ret := -0.700000 // sell
								if( mf > 0.053009 )
									ret := 0.135417
	if( k > 56.3671 )
		if( smoothK_k <= 80.2629 )
			if( rsi1 <= 54.9338 )
				if( smoothK_k <= 71.1414 )
					if( rsi1 <= 44.8704 )
						if( ad <= -65589.2 )
							if( d_k <= 1.3228 )
								if( ad_mf <= -139678 )
									ret := 0.804878 // buy
								if( ad_mf > -139678 )
									ret := 0.459119
							if( d_k > 1.3228 )
								if( smoothK_k <= 66.9296 )
									ret := -0.050725
								if( smoothK_k > 66.9296 )
									ret := 0.647059
						if( ad > -65589.2 )
							if( d_k <= -19.5008 )
								if( mf <= -0.257292 )
									ret := 0.111111
								if( mf > -0.257292 )
									ret := -0.396364
							if( d_k > -19.5008 )
								if( ad <= -4170.69 )
									ret := -0.049890
								if( ad > -4170.69 )
									ret := -0.238927
					if( rsi1 > 44.8704 )
						if( d <= 56.5152 )
							if( ad_mf <= -8377.71 )
								if( mf <= -0.029708 )
									ret := 0.563380
								if( mf > -0.029708 )
									ret := 0.275556
							if( ad_mf > -8377.71 )
								if( d_k <= -12.1026 )
									ret := -0.099026
								if( d_k > -12.1026 )
									ret := 0.222535
						if( d > 56.5152 )
							if( smoothD_d <= 69.8498 )
								if( ad <= -3974.98 )
									ret := 0.160851
								if( ad > -3974.98 )
									ret := -0.197674
							if( smoothD_d > 69.8498 )
								if( ad_mf <= 33301.1 )
									ret := 0.158856
								if( ad_mf > 33301.1 )
									ret := -0.312849
				if( smoothK_k > 71.1414 )
					if( mf <= 0.083293 )
						if( d <= 52.5469 )
							if( rsi1 <= 44.6936 )
								if( smoothD_d <= 48.3271 )
									ret := -0.266667
								if( smoothD_d > 48.3271 )
									ret := -0.733333 // sell
							if( rsi1 > 44.6936 )
								if( smoothK_k <= 73.0821 )
									ret := -0.214286
								if( smoothK_k > 73.0821 )
									ret := 0.075000
						if( d > 52.5469 )
							if( k <= 82.7194 )
								if( rsi1 <= 49.281 )
									ret := 0.101538
								if( rsi1 > 49.281 )
									ret := 0.280065
							if( k > 82.7194 )
								if( rsi1 <= 51.0273 )
									ret := -0.210227
								if( rsi1 > 51.0273 )
									ret := 0.411765
					if( mf > 0.083293 )
						if( k <= 80.46 )
							if( ad_mf <= 13297.1 )
								if( rsi1 <= 53.6567 )
									ret := 0.085714
								if( rsi1 > 53.6567 )
									ret := 0.516129
							if( ad_mf > 13297.1 )
								if( smoothD_d <= 74.0875 )
									ret := -0.408602
								if( smoothD_d > 74.0875 )
									ret := 0.207792
						if( k > 80.46 )
							if( ad_mf <= 39561.6 )
								if( mf <= 0.093717 )
									ret := 0.080000
								if( mf > 0.093717 )
									ret := -0.218045
							if( ad_mf > 39561.6 )
								ret := -0.727273 // sell
			if( rsi1 > 54.9338 )
				if( ad_mf <= -0.354166 )
					if( ad_mf <= -10540.2 )
						if( d_k <= -7.00082 )
							if( smoothD_d <= 35.1268 )
								if( ad <= -40652.4 )
									ret := -0.818182 // sell
								if( ad > -40652.4 )
									ret := 0.500000
							if( smoothD_d > 35.1268 )
								if( ad <= -93020.9 )
									ret := 0.037037
								if( ad > -93020.9 )
									ret := 0.505820
						if( d_k > -7.00082 )
							if( mf <= 0.054626 )
								if( rsi1 <= 70.3571 )
									ret := 0.266485
								if( rsi1 > 70.3571 )
									ret := 0.618357
							if( mf > 0.054626 )
								if( ad_mf <= -68796.8 )
									ret := 0.410909
								if( ad_mf > -68796.8 )
									ret := 0.063519
					if( ad_mf > -10540.2 )
						if( rsi1 <= 57.0258 )
							if( ad <= -9841.31 )
								ret := 0.913043 // buy
							if( ad > -9841.31 )
								if( d <= 70.7008 )
									ret := 0.315385
								if( d > 70.7008 )
									ret := -0.080357
						if( rsi1 > 57.0258 )
							if( rsi1 <= 75.6285 )
								if( ad <= -9751.01 )
									ret := 0.648649
								if( ad > -9751.01 )
									ret := 0.429710
							if( rsi1 > 75.6285 )
								if( mf <= 0.381567 )
									ret := 0.757576 // buy
								if( mf > 0.381567 )
									ret := 0.000000
				if( ad_mf > -0.354166 )
					if( rsi1 <= 66.5852 )
						if( smoothK_k <= 68.9573 )
							if( ad_mf <= 49636.3 )
								if( ad <= 46942.4 )
									ret := 0.062410
								if( ad > 46942.4 )
									ret := 0.509804
							if( ad_mf > 49636.3 )
								if( k <= 68.9751 )
									ret := -0.103896
								if( k > 68.9751 )
									ret := -0.404255
						if( smoothK_k > 68.9573 )
							if( d <= 85.9226 )
								if( ad <= 76128.6 )
									ret := 0.177570
								if( ad > 76128.6 )
									ret := -0.113821
							if( d > 85.9226 )
								if( ad <= 11151.5 )
									ret := 0.242268
								if( ad > 11151.5 )
									ret := 0.511628
					if( rsi1 > 66.5852 )
						if( ad_mf <= -0.008366 )
							if( smoothK_k <= 57.1359 )
								ret := -1.000000 // sell
							if( smoothK_k > 57.1359 )
								if( smoothD_d <= 77.6859 )
									ret := 0.027778
								if( smoothD_d > 77.6859 )
									ret := -0.720000 // sell
						if( ad_mf > -0.008366 )
							if( d <= 84.4946 )
								if( rsi1 <= 76.5086 )
									ret := 0.243916
								if( rsi1 > 76.5086 )
									ret := 0.454733
							if( d > 84.4946 )
								if( rsi1 <= 67.2863 )
									ret := 0.162162
								if( rsi1 > 67.2863 )
									ret := 0.617169
		if( smoothK_k > 80.2629 )
			if( d <= 93.2028 )
				if( ad_mf <= -0.09541 )
					if( rsi1 <= 58.9452 )
						if( ad <= -27932.3 )
							if( ad <= -74513.4 )
								if( ad_mf <= -102585 )
									ret := 0.509804
								if( ad_mf > -102585 )
									ret := 0.851064 // buy
							if( ad > -74513.4 )
								if( k <= 99.8663 )
									ret := 0.411063
								if( k > 99.8663 )
									ret := -0.160000
						if( ad > -27932.3 )
							if( d <= 80.5643 )
								if( rsi1 <= 38.7855 )
									ret := -0.487805
								if( rsi1 > 38.7855 )
									ret := 0.158284
							if( d > 80.5643 )
								if( ad_mf <= -14728.7 )
									ret := 0.308581
								if( ad_mf > -14728.7 )
									ret := 0.160529
					if( rsi1 > 58.9452 )
						if( mf <= 0.087691 )
							if( k <= 85.9024 )
								if( ad <= -138026 )
									ret := -0.500000
								if( ad > -138026 )
									ret := 0.470037
							if( k > 85.9024 )
								if( ad_mf <= -57497.7 )
									ret := 0.411290
								if( ad_mf > -57497.7 )
									ret := 0.628129
						if( mf > 0.087691 )
							if( ad <= -9029.73 )
								if( rsi1 <= 63.4029 )
									ret := 0.000000
								if( rsi1 > 63.4029 )
									ret := 0.389049
							if( ad > -9029.73 )
								if( smoothD_d <= 72.4337 )
									ret := 0.056604
								if( smoothD_d > 72.4337 )
									ret := 0.557809
				if( ad_mf > -0.09541 )
					if( rsi1 <= 55.2226 )
						if( d <= 79.2951 )
							if( rsi1 <= 38.9218 )
								if( rsi1 <= 31.1303 )
									ret := -0.833333 // sell
								if( rsi1 > 31.1303 )
									ret := -0.113402
							if( rsi1 > 38.9218 )
								if( ad_mf <= 1630.12 )
									ret := 0.516667
								if( ad_mf > 1630.12 )
									ret := 0.113176
						if( d > 79.2951 )
							if( rsi1 <= 47.027 )
								if( ad_mf <= 165486 )
									ret := -0.177700
								if( ad_mf > 165486 )
									ret := 0.478261
							if( rsi1 > 47.027 )
								if( k <= 93.014 )
									ret := -0.019729
								if( k > 93.014 )
									ret := 0.208333
					if( rsi1 > 55.2226 )
						if( ad <= 106509 )
							if( rsi1 <= 63.7478 )
								if( k <= 92.3688 )
									ret := 0.310402
								if( k > 92.3688 )
									ret := 0.187059
							if( rsi1 > 63.7478 )
								if( rsi1 <= 76.3545 )
									ret := 0.446103
								if( rsi1 > 76.3545 )
									ret := 0.602299
						if( ad > 106509 )
							if( ad_mf <= 124988 )
								if( k <= 85.6688 )
									ret := 0.133333
								if( k > 85.6688 )
									ret := -0.494118
							if( ad_mf > 124988 )
								if( rsi1 <= 76.5752 )
									ret := 0.189300
								if( rsi1 > 76.5752 )
									ret := 0.624000
			if( d > 93.2028 )
				if( rsi1 <= 60.452 )
					if( ad_mf <= -7893.73 )
						if( ad <= -136667 )
							if( d_k <= 1.1082 )
								ret := -0.125000
							if( d_k > 1.1082 )
								ret := -0.785714 // sell
						if( ad > -136667 )
							if( ad <= -58327 )
								if( smoothK_k <= 87.0075 )
									ret := 0.250000
								if( smoothK_k > 87.0075 )
									ret := 0.858491 // buy
							if( ad > -58327 )
								if( k <= 91.4229 )
									ret := 0.118110
								if( k > 91.4229 )
									ret := 0.427110
					if( ad_mf > -7893.73 )
						if( rsi1 <= 50.538 )
							if( rsi1 <= 49.6061 )
								if( ad <= -5032.59 )
									ret := -0.576923
								if( ad > -5032.59 )
									ret := 0.130879
							if( rsi1 > 49.6061 )
								if( smoothK_k <= 88.3166 )
									ret := 0.090909
								if( smoothK_k > 88.3166 )
									ret := -0.281250
						if( rsi1 > 50.538 )
							if( mf <= 0.023407 )
								if( d_k <= -0.703456 )
									ret := 0.144444
								if( d_k > -0.703456 )
									ret := 0.433673
							if( mf > 0.023407 )
								if( d <= 94.0474 )
									ret := -0.125000
								if( d > 94.0474 )
									ret := 0.240896
				if( rsi1 > 60.452 )
					if( rsi1 <= 72.0104 )
						if( smoothD_d <= 96.8698 )
							if( ad_mf <= 30707.3 )
								if( rsi1 <= 60.5215 )
									ret := 0.838710 // buy
								if( rsi1 > 60.5215 )
									ret := 0.490503
							if( ad_mf > 30707.3 )
								if( ad_mf <= 41197 )
									ret := 0.771218 // buy
								if( ad_mf > 41197 )
									ret := 0.481481
						if( smoothD_d > 96.8698 )
							if( ad <= 30513 )
								if( rsi1 <= 69.5247 )
									ret := 0.363636
								if( rsi1 > 69.5247 )
									ret := 0.000000
							if( ad > 30513 )
								ret := -0.380952
					if( rsi1 > 72.0104 )
						if( d_k <= 2.24668 )
							if( ad <= 38218.5 )
								if( mf <= 0.111771 )
									ret := 0.640469
								if( mf > 0.111771 )
									ret := 0.548762
							if( ad > 38218.5 )
								if( mf <= 0.11417 )
									ret := 0.621818
								if( mf > 0.11417 )
									ret := 0.440729
						if( d_k > 2.24668 )
							if( ad <= -36828.3 )
								if( ad <= -50447.2 )
									ret := 0.507937
								if( ad > -50447.2 )
									ret := -0.375000
							if( ad > -36828.3 )
								if( ad <= 15103.5 )
									ret := 0.651972
								if( ad > 15103.5 )
									ret := 0.808642 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_LINKUSDT_15Min_8a1bd2fd(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


