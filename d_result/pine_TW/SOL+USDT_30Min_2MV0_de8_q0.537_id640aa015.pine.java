//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: SOLUSDT_30Min_2MV0_640aa015 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2MV0_640aa015", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_640aa015(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 1.50054e+07 )
		if( MFI_High <= -56.4213 )
			if( Positive_Money_Flow_Sum <= 1.20953e+06 )
				if( Negative_Money_Flow_Sum <= 759030 )
					if( Typical_Price <= 1.88927 )
						if( Positive_Money_Flow_Sum <= 167610 )
							if( Positive_Money_Flow_Sum <= 101659 )
								if( Negative_Money_Flow_Sum <= 403219 )
									ret := 0.611111
								if( Negative_Money_Flow_Sum > 403219 )
									ret := 0.100000
							if( Positive_Money_Flow_Sum > 101659 )
								if( VIP_VIM <= -0.305403 )
									ret := 0.229167
								if( VIP_VIM > -0.305403 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 167610 )
							if( VIP_VIM <= -0.446533 )
								ret := -0.250000
							if( VIP_VIM > -0.446533 )
								if( VIM <= 1.14377 )
									ret := -0.500000
								if( VIM > 1.14377 )
									ret := -1.000000 // sell
					if( Typical_Price > 1.88927 )
						if( MFI_Low <= -3.10657 )
							if( Raw_Money_Flow <= 71016.4 )
								if( Typical_Price <= 1.99337 )
									ret := -0.250000
								if( Typical_Price > 1.99337 )
									ret := 0.576923
							if( Raw_Money_Flow > 71016.4 )
								ret := -0.571429
						if( MFI_Low > -3.10657 )
							if( Raw_Money_Flow <= 138802 )
								if( VIP <= 0.850059 )
									ret := -0.704348 // sell
								if( VIP > 0.850059 )
									ret := -0.066667
							if( Raw_Money_Flow > 138802 )
								ret := 0.428571
				if( Negative_Money_Flow_Sum > 759030 )
					if( Typical_Price <= 2.51293 )
						if( Negative_Money_Flow <= 228505 )
							if( Positive_Money_Flow_Sum <= 367512 )
								if( Negative_Money_Flow_Sum <= 899379 )
									ret := 0.628205
								if( Negative_Money_Flow_Sum > 899379 )
									ret := 0.145299
							if( Positive_Money_Flow_Sum > 367512 )
								if( Typical_Price <= 1.6845 )
									ret := 0.214286
								if( Typical_Price > 1.6845 )
									ret := 0.687500
						if( Negative_Money_Flow > 228505 )
							if( Negative_Money_Flow <= 519999 )
								if( Raw_Money_Flow <= 374053 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 374053 )
									ret := 0.818182 // buy
							if( Negative_Money_Flow > 519999 )
								if( VIP_VIM <= -0.726616 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.726616 )
									ret := 0.000000
					if( Typical_Price > 2.51293 )
						if( Positive_Money_Flow_Sum <= 291397 )
							if( Negative_Money_Flow <= 197472 )
								if( MFI_High <= -62.2507 )
									ret := 0.666667
								if( MFI_High > -62.2507 )
									ret := -0.208333
							if( Negative_Money_Flow > 197472 )
								if( Negative_Money_Flow <= 629752 )
									ret := -0.733333 // sell
								if( Negative_Money_Flow > 629752 )
									ret := 0.384615
						if( Positive_Money_Flow_Sum > 291397 )
							if( Typical_Price <= 13.3922 )
								if( Negative_Money_Flow_Sum <= 3.08003e+06 )
									ret := 0.245399
								if( Negative_Money_Flow_Sum > 3.08003e+06 )
									ret := 0.639535
							if( Typical_Price > 13.3922 )
								if( VIP <= 0.603226 )
									ret := -0.375000
								if( VIP > 0.603226 )
									ret := 0.125000
			if( Positive_Money_Flow_Sum > 1.20953e+06 )
				if( Positive_Money_Flow <= 7.95847e+06 )
					if( Typical_Price <= 18.1567 )
						if( Negative_Money_Flow_Sum <= 1.9151e+07 )
							if( VIP_VIM <= -0.790369 )
								if( Positive_Money_Flow_Sum <= 1.89844e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.89844e+06 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.790369 )
								if( Typical_Price <= 6.67282 )
									ret := 0.680851
								if( Typical_Price > 6.67282 )
									ret := 0.084795
						if( Negative_Money_Flow_Sum > 1.9151e+07 )
							if( VIP_VIM <= -0.927229 )
								ret := -0.800000 // sell
							if( VIP_VIM > -0.927229 )
								if( Positive_Money_Flow_Sum <= 1.47459e+07 )
									ret := 0.590244
								if( Positive_Money_Flow_Sum > 1.47459e+07 )
									ret := -0.400000
					if( Typical_Price > 18.1567 )
						if( Raw_Money_Flow <= 2.38999e+06 )
							if( Positive_Money_Flow <= 963228 )
								if( Negative_Money_Flow_Sum <= 1.59948e+07 )
									ret := -0.194915
								if( Negative_Money_Flow_Sum > 1.59948e+07 )
									ret := -0.026769
							if( Positive_Money_Flow > 963228 )
								if( Negative_Money_Flow_Sum <= 2.40674e+07 )
									ret := 0.470588
								if( Negative_Money_Flow_Sum > 2.40674e+07 )
									ret := -0.060811
						if( Raw_Money_Flow > 2.38999e+06 )
							if( Typical_Price <= 33.8544 )
								if( Negative_Money_Flow_Sum <= 1.85663e+07 )
									ret := -0.188119
								if( Negative_Money_Flow_Sum > 1.85663e+07 )
									ret := 0.272395
							if( Typical_Price > 33.8544 )
								if( Positive_Money_Flow_Sum <= 7.30795e+06 )
									ret := -0.213018
								if( Positive_Money_Flow_Sum > 7.30795e+06 )
									ret := 0.081099
				if( Positive_Money_Flow > 7.95847e+06 )
					if( Negative_Money_Flow_Sum <= 1.23901e+08 )
						if( Typical_Price <= 162.145 )
							if( Negative_Money_Flow_Sum <= 7.12227e+07 )
								if( MFI_Low <= 1.3974 )
									ret := -0.750000 // sell
								if( MFI_Low > 1.3974 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 7.12227e+07 )
								if( Raw_Money_Flow <= 9.90723e+06 )
									ret := -0.562500
								if( Raw_Money_Flow > 9.90723e+06 )
									ret := -0.894737 // sell
						if( Typical_Price > 162.145 )
							if( MFI <= 19.9863 )
								ret := -0.500000
							if( MFI > 19.9863 )
								ret := 0.200000
					if( Negative_Money_Flow_Sum > 1.23901e+08 )
						if( Typical_Price <= 152.139 )
							if( Typical_Price <= 30.6127 )
								if( Negative_Money_Flow_Sum <= 1.66932e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.66932e+08 )
									ret := -0.500000
							if( Typical_Price > 30.6127 )
								if( Positive_Money_Flow_Sum <= 1.54601e+08 )
									ret := 0.211382
								if( Positive_Money_Flow_Sum > 1.54601e+08 )
									ret := -0.750000 // sell
						if( Typical_Price > 152.139 )
							if( MFI <= 23.3508 )
								if( Negative_Money_Flow_Sum <= 2.45197e+08 )
									ret := -0.181818
								if( Negative_Money_Flow_Sum > 2.45197e+08 )
									ret := -0.729730 // sell
							if( MFI > 23.3508 )
								ret := 0.800000 // buy
		if( MFI_High > -56.4213 )
			if( Typical_Price <= 140.048 )
				if( Negative_Money_Flow_Sum <= 2.65842e+08 )
					if( Negative_Money_Flow_Sum <= 546401 )
						if( Negative_Money_Flow_Sum <= 341350 )
							if( Raw_Money_Flow <= 146835 )
								if( Positive_Money_Flow <= 50781.6 )
									ret := 0.075053
								if( Positive_Money_Flow > 50781.6 )
									ret := -0.207071
							if( Raw_Money_Flow > 146835 )
								if( Typical_Price <= 2.34553 )
									ret := 0.629213
								if( Typical_Price > 2.34553 )
									ret := -0.294118
						if( Negative_Money_Flow_Sum > 341350 )
							if( Positive_Money_Flow <= 431270 )
								if( Typical_Price <= 2.50704 )
									ret := -0.121132
								if( Typical_Price > 2.50704 )
									ret := -0.450151
							if( Positive_Money_Flow > 431270 )
								if( MFI <= 90.0738 )
									ret := 0.909091 // buy
								if( MFI > 90.0738 )
									ret := -0.125000
					if( Negative_Money_Flow_Sum > 546401 )
						if( Typical_Price <= 2.03312 )
							if( VIP_VIM <= -0.552493 )
								if( Positive_Money_Flow_Sum <= 281101 )
									ret := 0.444444
								if( Positive_Money_Flow_Sum > 281101 )
									ret := -0.682927
							if( VIP_VIM > -0.552493 )
								if( VIP <= 1.15953 )
									ret := 0.296107
								if( VIP > 1.15953 )
									ret := -0.305085
						if( Typical_Price > 2.03312 )
							if( Positive_Money_Flow_Sum <= 341335 )
								if( Raw_Money_Flow <= 98058.5 )
									ret := -0.487342
								if( Raw_Money_Flow > 98058.5 )
									ret := 0.166667
							if( Positive_Money_Flow_Sum > 341335 )
								if( Negative_Money_Flow_Sum <= 1.15921e+08 )
									ret := 0.050703
								if( Negative_Money_Flow_Sum > 1.15921e+08 )
									ret := -0.051619
				if( Negative_Money_Flow_Sum > 2.65842e+08 )
					if( VIM <= 0.855357 )
						ret := -1.000000 // sell
					if( VIM > 0.855357 )
						if( Raw_Money_Flow <= 1.57685e+07 )
							if( MFI_Low <= 6.00696 )
								ret := -0.857143 // sell
							if( MFI_Low > 6.00696 )
								if( Positive_Money_Flow <= 8.36161e+06 )
									ret := -0.222222
								if( Positive_Money_Flow > 8.36161e+06 )
									ret := 0.583333
						if( Raw_Money_Flow > 1.57685e+07 )
							if( Positive_Money_Flow <= 3.64858e+07 )
								if( VIP_VIM <= -0.227357 )
									ret := 0.944444 // buy
								if( VIP_VIM > -0.227357 )
									ret := 0.628571
							if( Positive_Money_Flow > 3.64858e+07 )
								if( VIP <= 0.832431 )
									ret := 0.580000
								if( VIP > 0.832431 )
									ret := -0.032258
			if( Typical_Price > 140.048 )
				if( Negative_Money_Flow_Sum <= 5.18218e+08 )
					if( Negative_Money_Flow <= 8.62373e+06 )
						if( Negative_Money_Flow_Sum <= 6.43417e+07 )
							if( Raw_Money_Flow <= 6.55096e+06 )
								if( Positive_Money_Flow_Sum <= 3.52004e+07 )
									ret := 0.021214
								if( Positive_Money_Flow_Sum > 3.52004e+07 )
									ret := -0.068246
							if( Raw_Money_Flow > 6.55096e+06 )
								if( VIP_VIM <= 0.470832 )
									ret := 0.111812
								if( VIP_VIM > 0.470832 )
									ret := -0.073113
						if( Negative_Money_Flow_Sum > 6.43417e+07 )
							if( Negative_Money_Flow_Sum <= 9.67734e+07 )
								if( MFI_High <= -30.085 )
									ret := -0.025070
								if( MFI_High > -30.085 )
									ret := -0.221221
							if( Negative_Money_Flow_Sum > 9.67734e+07 )
								if( MFI_Low <= 26.6446 )
									ret := -0.074048
								if( MFI_Low > 26.6446 )
									ret := 0.052356
					if( Negative_Money_Flow > 8.62373e+06 )
						if( Negative_Money_Flow_Sum <= 1.83094e+08 )
							if( Money_Flow_Ratio <= 0.32159 )
								if( Positive_Money_Flow_Sum <= 2.77914e+07 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 2.77914e+07 )
									ret := -0.909091 // sell
							if( Money_Flow_Ratio > 0.32159 )
								if( Positive_Money_Flow_Sum <= 4.00136e+07 )
									ret := -0.155280
								if( Positive_Money_Flow_Sum > 4.00136e+07 )
									ret := 0.070913
						if( Negative_Money_Flow_Sum > 1.83094e+08 )
							if( Positive_Money_Flow_Sum <= 2.07471e+08 )
								if( Typical_Price <= 150.14 )
									ret := 0.300000
								if( Typical_Price > 150.14 )
									ret := 0.717647 // buy
							if( Positive_Money_Flow_Sum > 2.07471e+08 )
								if( Positive_Money_Flow <= 2.4966e+07 )
									ret := -0.444444
								if( Positive_Money_Flow > 2.4966e+07 )
									ret := 0.600000
				if( Negative_Money_Flow_Sum > 5.18218e+08 )
					if( VIP <= 0.832264 )
						if( VIP <= 0.821375 )
							if( Raw_Money_Flow <= 6.76756e+07 )
								ret := -0.200000
							if( Raw_Money_Flow > 6.76756e+07 )
								ret := -0.666667
						if( VIP > 0.821375 )
							ret := 1.000000 // buy
					if( VIP > 0.832264 )
						if( Positive_Money_Flow <= 3.65967e+07 )
							if( Raw_Money_Flow <= 2.86859e+07 )
								ret := -0.500000
							if( Raw_Money_Flow > 2.86859e+07 )
								ret := 0.500000
						if( Positive_Money_Flow > 3.65967e+07 )
							if( Raw_Money_Flow <= 1.13913e+08 )
								if( Positive_Money_Flow <= 4.93799e+07 )
									ret := -0.500000
								if( Positive_Money_Flow > 4.93799e+07 )
									ret := -0.928571 // sell
							if( Raw_Money_Flow > 1.13913e+08 )
								ret := 0.000000
	if( Negative_Money_Flow > 1.50054e+07 )
		if( VIP <= 0.826947 )
			if( Typical_Price <= 139.119 )
				if( Raw_Money_Flow <= 2.27086e+07 )
					if( Negative_Money_Flow_Sum <= 1.34438e+08 )
						if( Negative_Money_Flow_Sum <= 7.56238e+07 )
							if( Negative_Money_Flow_Sum <= 6.40001e+07 )
								if( Typical_Price <= 30.1322 )
									ret := 0.526316
								if( Typical_Price > 30.1322 )
									ret := -0.218750
							if( Negative_Money_Flow_Sum > 6.40001e+07 )
								if( Money_Flow_Ratio <= 0.39163 )
									ret := 0.176471
								if( Money_Flow_Ratio > 0.39163 )
									ret := 0.964286 // buy
						if( Negative_Money_Flow_Sum > 7.56238e+07 )
							if( Typical_Price <= 113.313 )
								if( MFI <= 24.5727 )
									ret := 0.181818
								if( MFI > 24.5727 )
									ret := -0.455882
							if( Typical_Price > 113.313 )
								if( Negative_Money_Flow <= 2.16974e+07 )
									ret := 0.547619
								if( Negative_Money_Flow > 2.16974e+07 )
									ret := -0.500000
					if( Negative_Money_Flow_Sum > 1.34438e+08 )
						if( Typical_Price <= 30.8933 )
							if( VIP_VIM <= -0.615058 )
								ret := -1.000000 // sell
							if( VIP_VIM > -0.615058 )
								ret := -0.250000
						if( Typical_Price > 30.8933 )
							if( VIP_VIM <= -0.388089 )
								if( Raw_Money_Flow <= 2.21044e+07 )
									ret := 0.766990 // buy
								if( Raw_Money_Flow > 2.21044e+07 )
									ret := 0.111111
							if( VIP_VIM > -0.388089 )
								if( VIP <= 0.816643 )
									ret := -0.217391
								if( VIP > 0.816643 )
									ret := 1.000000 // buy
				if( Raw_Money_Flow > 2.27086e+07 )
					if( Negative_Money_Flow_Sum <= 2.41961e+08 )
						if( Typical_Price <= 120.022 )
							if( MFI_High <= -63.136 )
								if( VIP_VIM <= -0.564436 )
									ret := 0.918919 // buy
								if( VIP_VIM > -0.564436 )
									ret := 0.500000
							if( MFI_High > -63.136 )
								if( MFI_High <= -56.2031 )
									ret := 0.105263
								if( MFI_High > -56.2031 )
									ret := 0.604317
						if( Typical_Price > 120.022 )
							if( Positive_Money_Flow_Sum <= 5.65804e+07 )
								if( MFI <= 24.3835 )
									ret := 0.515152
								if( MFI > 24.3835 )
									ret := 0.066667
							if( Positive_Money_Flow_Sum > 5.65804e+07 )
								if( Negative_Money_Flow_Sum <= 1.94983e+08 )
									ret := 0.055556
								if( Negative_Money_Flow_Sum > 1.94983e+08 )
									ret := -0.833333 // sell
					if( Negative_Money_Flow_Sum > 2.41961e+08 )
						if( VIM <= 1.14721 )
							if( Negative_Money_Flow <= 4.63157e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 4.63157e+07 )
								if( Typical_Price <= 127.054 )
									ret := 0.000000
								if( Typical_Price > 127.054 )
									ret := -1.000000 // sell
						if( VIM > 1.14721 )
							if( Negative_Money_Flow <= 2.18626e+07 )
								ret := 0.000000
							if( Negative_Money_Flow > 2.18626e+07 )
								if( MFI_Low <= 3.65435 )
									ret := 0.700000 // buy
								if( MFI_Low > 3.65435 )
									ret := 0.910448 // buy
			if( Typical_Price > 139.119 )
				if( Raw_Money_Flow <= 9.56256e+07 )
					if( Raw_Money_Flow <= 2.7411e+07 )
						if( Money_Flow_Ratio <= 0.124369 )
							if( VIP <= 0.700191 )
								if( Typical_Price <= 149.578 )
									ret := 0.500000
								if( Typical_Price > 149.578 )
									ret := -0.142857
							if( VIP > 0.700191 )
								if( Negative_Money_Flow <= 2.01388e+07 )
									ret := -0.250000
								if( Negative_Money_Flow > 2.01388e+07 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.124369 )
							if( VIM <= 1.24437 )
								if( MFI_Low <= -2.29272 )
									ret := -0.285714
								if( MFI_Low > -2.29272 )
									ret := 0.228723
							if( VIM > 1.24437 )
								if( Negative_Money_Flow_Sum <= 2.07785e+08 )
									ret := 0.369565
								if( Negative_Money_Flow_Sum > 2.07785e+08 )
									ret := 0.848485 // buy
					if( Raw_Money_Flow > 2.7411e+07 )
						if( VIM <= 1.0298 )
							if( Money_Flow_Ratio <= 0.5175 )
								ret := 0.750000 // buy
							if( Money_Flow_Ratio > 0.5175 )
								ret := 1.000000 // buy
						if( VIM > 1.0298 )
							if( Positive_Money_Flow_Sum <= 9.40528e+07 )
								if( VIP <= 0.773855 )
									ret := -0.127517
								if( VIP > 0.773855 )
									ret := -0.684211
							if( Positive_Money_Flow_Sum > 9.40528e+07 )
								if( Money_Flow_Ratio <= 0.512317 )
									ret := 0.353846
								if( Money_Flow_Ratio > 0.512317 )
									ret := -0.294118
				if( Raw_Money_Flow > 9.56256e+07 )
					if( Negative_Money_Flow_Sum <= 2.58795e+08 )
						ret := -0.200000
					if( Negative_Money_Flow_Sum > 2.58795e+08 )
						if( VIM <= 1.15777 )
							ret := 1.000000 // buy
						if( VIM > 1.15777 )
							if( Negative_Money_Flow_Sum <= 8.28781e+08 )
								ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 8.28781e+08 )
								ret := 1.000000 // buy
		if( VIP > 0.826947 )
			if( Positive_Money_Flow_Sum <= 1.14652e+08 )
				if( VIM <= 1.07687 )
					if( VIP_VIM <= 0.214993 )
						if( Positive_Money_Flow_Sum <= 6.07596e+07 )
							if( Positive_Money_Flow_Sum <= 5.40024e+07 )
								if( MFI <= 40.3428 )
									ret := 0.061538
								if( MFI > 40.3428 )
									ret := -0.319149
							if( Positive_Money_Flow_Sum > 5.40024e+07 )
								if( Positive_Money_Flow_Sum <= 5.59465e+07 )
									ret := 0.842105 // buy
								if( Positive_Money_Flow_Sum > 5.59465e+07 )
									ret := 0.166667
						if( Positive_Money_Flow_Sum > 6.07596e+07 )
							if( Typical_Price <= 76.1437 )
								if( Positive_Money_Flow_Sum <= 1.06873e+08 )
									ret := -0.707692 // sell
								if( Positive_Money_Flow_Sum > 1.06873e+08 )
									ret := 0.600000
							if( Typical_Price > 76.1437 )
								if( VIP <= 0.961917 )
									ret := -0.062201
								if( VIP > 0.961917 )
									ret := -0.329545
					if( VIP_VIM > 0.214993 )
						if( VIP <= 1.19023 )
							if( Positive_Money_Flow_Sum <= 7.70151e+07 )
								if( Typical_Price <= 107.837 )
									ret := -0.500000
								if( Typical_Price > 107.837 )
									ret := 0.200000
							if( Positive_Money_Flow_Sum > 7.70151e+07 )
								if( Typical_Price <= 93.0015 )
									ret := 1.000000 // buy
								if( Typical_Price > 93.0015 )
									ret := 0.370370
						if( VIP > 1.19023 )
							if( Negative_Money_Flow_Sum <= 4.99559e+07 )
								if( Positive_Money_Flow_Sum <= 8.83679e+07 )
									ret := 0.555556
								if( Positive_Money_Flow_Sum > 8.83679e+07 )
									ret := -0.333333
							if( Negative_Money_Flow_Sum > 4.99559e+07 )
								ret := -0.833333 // sell
				if( VIM > 1.07687 )
					if( Positive_Money_Flow_Sum <= 5.53364e+07 )
						if( Typical_Price <= 132.921 )
							if( VIP <= 0.839578 )
								if( MFI <= 26.9185 )
									ret := 0.750000 // buy
								if( MFI > 26.9185 )
									ret := -0.250000
							if( VIP > 0.839578 )
								if( Positive_Money_Flow_Sum <= 3.73609e+07 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 3.73609e+07 )
									ret := 0.966667 // buy
						if( Typical_Price > 132.921 )
							if( Negative_Money_Flow <= 1.55329e+07 )
								ret := 0.857143 // buy
							if( Negative_Money_Flow > 1.55329e+07 )
								if( VIP_VIM <= -0.238097 )
									ret := 0.121212
								if( VIP_VIM > -0.238097 )
									ret := -0.666667
					if( Positive_Money_Flow_Sum > 5.53364e+07 )
						if( Typical_Price <= 101.296 )
							if( Negative_Money_Flow_Sum <= 1.73048e+08 )
								if( Positive_Money_Flow_Sum <= 7.24242e+07 )
									ret := 0.190476
								if( Positive_Money_Flow_Sum > 7.24242e+07 )
									ret := 0.867925 // buy
							if( Negative_Money_Flow_Sum > 1.73048e+08 )
								if( Typical_Price <= 54.0833 )
									ret := -1.000000 // sell
								if( Typical_Price > 54.0833 )
									ret := 0.222222
						if( Typical_Price > 101.296 )
							if( VIM <= 1.14423 )
								if( MFI_High <= -46.782 )
									ret := 0.303797
								if( MFI_High > -46.782 )
									ret := -0.209091
							if( VIM > 1.14423 )
								if( MFI <= 25.1769 )
									ret := 0.285714
								if( MFI > 25.1769 )
									ret := -0.545455
			if( Positive_Money_Flow_Sum > 1.14652e+08 )
				if( Typical_Price <= 80.0834 )
					if( Positive_Money_Flow_Sum <= 1.60668e+08 )
						if( Raw_Money_Flow <= 1.57778e+07 )
							if( Typical_Price <= 65.6031 )
								ret := -0.250000
							if( Typical_Price > 65.6031 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.57778e+07 )
							if( Positive_Money_Flow_Sum <= 1.31889e+08 )
								if( Negative_Money_Flow <= 1.76586e+07 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow > 1.76586e+07 )
									ret := 0.363636
							if( Positive_Money_Flow_Sum > 1.31889e+08 )
								if( Negative_Money_Flow_Sum <= 1.64653e+08 )
									ret := 0.574468
								if( Negative_Money_Flow_Sum > 1.64653e+08 )
									ret := -0.400000
					if( Positive_Money_Flow_Sum > 1.60668e+08 )
						if( Positive_Money_Flow_Sum <= 1.69539e+08 )
							if( Raw_Money_Flow <= 1.7692e+07 )
								ret := -0.666667
							if( Raw_Money_Flow > 1.7692e+07 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.69539e+08 )
							if( VIP_VIM <= 0.492258 )
								if( Raw_Money_Flow <= 1.63567e+07 )
									ret := -0.666667
								if( Raw_Money_Flow > 1.63567e+07 )
									ret := 0.232143
							if( VIP_VIM > 0.492258 )
								if( MFI <= 85.464 )
									ret := -1.000000 // sell
								if( MFI > 85.464 )
									ret := 0.500000
				if( Typical_Price > 80.0834 )
					if( Negative_Money_Flow_Sum <= 7.40785e+08 )
						if( VIM <= 1.06823 )
							if( VIP <= 1.1495 )
								if( Raw_Money_Flow <= 2.89113e+07 )
									ret := 0.163768
								if( Raw_Money_Flow > 2.89113e+07 )
									ret := -0.036952
							if( VIP > 1.1495 )
								if( Positive_Money_Flow_Sum <= 2.65987e+08 )
									ret := 0.147766
								if( Positive_Money_Flow_Sum > 2.65987e+08 )
									ret := 0.476364
						if( VIM > 1.06823 )
							if( Typical_Price <= 188.042 )
								if( Negative_Money_Flow_Sum <= 6.27252e+08 )
									ret := 0.528517
								if( Negative_Money_Flow_Sum > 6.27252e+08 )
									ret := -0.133333
							if( Typical_Price > 188.042 )
								if( Positive_Money_Flow_Sum <= 1.99695e+08 )
									ret := 0.230769
								if( Positive_Money_Flow_Sum > 1.99695e+08 )
									ret := -0.560000
					if( Negative_Money_Flow_Sum > 7.40785e+08 )
						if( VIP_VIM <= 0.022032 )
							if( Negative_Money_Flow_Sum <= 1.10076e+09 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.10076e+09 )
								ret := -0.750000 // sell
						if( VIP_VIM > 0.022032 )
							ret := -0.333333
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_640aa015(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)

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


